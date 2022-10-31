package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class gcd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 최대공약수 : 공통된 약수 중 최대인 수
        // 최소공배수 : 공통된 배수 중 최소인 수

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] answer = {};

        answer = new int[2];
        if(m % n == 0)
        {
            answer[0] = n;
            answer[1] = m;
        }
        else
        {
            for(int i = 1; i <= m; i++)
            {
                if(n % i == 0 && m % i == 0)
                {
                    answer[0] = i;
                }
                answer[1] = n * m / answer[0];
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
