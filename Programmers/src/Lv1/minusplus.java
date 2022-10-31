package Lv1;

import java.io.*;

public class minusplus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int answer = 123456789;
        answer = 0;

        for(int i = 0; i < absolutes.length; i++)
        {
            if(signs[i] == true)
            {
                answer += absolutes[i];
            }
            else
            {
                answer -= absolutes[i];
            }
        }

        System.out.println(answer);

    }
}
