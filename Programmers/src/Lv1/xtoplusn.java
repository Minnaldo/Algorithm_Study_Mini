package Lv1;

import java.io.*;

public class xtoplusn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] answer = {};

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        answer = new long[n];

        for(int i = 0; i < n; i++)
        {
            answer[i] = (long) x * (i+1);
            System.out.println(answer[i]);
        }
    }
}
