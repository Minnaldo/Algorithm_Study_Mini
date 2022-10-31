package Lv2;

import java.io.*;

public class expressionofnumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 15;

        int answer = 0;

        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                sum += j;
                if (sum > n)
                {
                    sum = 0;
                    break;
                }
                else if (sum == n)
                {
                    answer++;
                    sum = 0;
                    break;
                }
            }

        }

        System.out.println(answer);

    }
}
