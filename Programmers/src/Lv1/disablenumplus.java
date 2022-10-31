package Lv1;

import java.io.*;

public class disablenumplus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = {5,8,4,0,6,7,9};
        int answer = -1;
        answer = 0;

        int[] checks = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean[] chk = new boolean[checks.length];

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < checks.length; j++)
            {
                if(numbers[i] == checks[j])
                    chk[j] = true;
            }
        }

        for(int i = 0; i < chk.length; i++)
        {
            if(chk[i] == false)
                answer += i;
        }


        System.out.println(answer);

    }
}
