package Lv1;

import java.io.*;

public class phonenumber_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String phone_number = br.readLine();

        String answer ="";
        char[] ch = phone_number.toCharArray();

        for(int i = 0; i < ch.length - 4; i++)
        {
            ch[i] = '*';
        }

        answer = String.valueOf(ch);
        System.out.println(answer);

    }
}
