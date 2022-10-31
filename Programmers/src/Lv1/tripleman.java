package Lv1;

import java.io.*;

public class tripleman {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = {-3, -2, -1, 0, 1, 2, 3};

        int answer = 0;

        int sum = 0;
        for(int i = 0; i < number.length - 2; i++)
        {
            for(int j = i + 1; j < number.length - 1; j++)
            {
                for (int k = j + 1; k < number.length; k++)
                {
                    sum = 0;
                    sum += number[i] + number[j] + number[k];
                    if(sum == 0) {
                        System.out.println(number[i] + " " + number[j] + " " + number[k]);
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
