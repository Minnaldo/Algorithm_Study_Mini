package Lv1;

import java.io.*;

public class pro_sqrt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long answer = 0;

        long n = Integer.parseInt(br.readLine());

        double a = 0;
        a = Math.sqrt(n);
        System.out.println((long)a);

        if(Math.sqrt(n) != (long)a)
        {
            answer = -1;
        }
        else
        {
            answer = ((long)a+1) * ((long)a+1);
        }

        System.out.println(answer);
    }
}
