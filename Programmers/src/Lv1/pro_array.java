package Lv1;

import java.io.*;

public class pro_array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answer = {};

        long n = Long.parseLong(br.readLine());

        int ct = 0;
        long num = n;

        while(n > 0) {
            ct++;
            n = n / 10;
        }

        answer = new int[ct];

        for(int i = 0; i < ct; i++)
        {
            answer[i] = (int) (num % 10);
            System.out.println(answer[i]);

            num = num / 10;
        }

    }
}
