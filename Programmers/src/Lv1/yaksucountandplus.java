package Lv1;

import java.io.*;

public class yaksucountandplus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        int result = Integer.parseInt(br.readLine());

        int answer = 0;
        int[] yaksu_arr = new int[right - left + 1];

        for(int ct = left - left; ct <= right - left; ct++)
        {
            int yaksu_count = 0;
            for (int i = 1; i <= left + ct; i++)
            {
                if ((left+ct) % i == 0)
                {
                    yaksu_count++;
                }
            }
            yaksu_arr[ct] = yaksu_count;
        }

        for(int i = 0; i < yaksu_arr.length; i++)
        {
            if(yaksu_arr[i] % 2 == 0)
                answer += i+left;
            else
                answer -= i+left;
        }

        System.out.println(answer);

    }
}
