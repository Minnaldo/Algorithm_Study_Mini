package Lv1;

import java.io.*;

public class pro_string_jungsu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long answer = 0;

        String s = br.readLine();

        answer = Integer.parseInt(s);

        System.out.println(answer);

    }
}
