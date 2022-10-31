package Lv1;

import java.io.*;

public class collatz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        int number = Integer.parseInt(br.readLine());
        long num = (long) number;
        int cnt = 0;

        while(num != 1) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

            cnt++;
            if(cnt == 500)
            {
                answer = -1;
                break;
            }
        }

        answer = cnt;

        System.out.println(cnt);
    }
}
