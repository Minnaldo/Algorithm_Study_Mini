package Lv1;

import java.io.*;

public class phonenumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String phone_number = br.readLine();

        String str = "";
        String answer = "";

        str = phone_number.substring(phone_number.length()-4, phone_number.length());

        for(int i = 0; i < phone_number.length()-4; i++)
        {
            answer += "*";
        }

        answer += str;

        System.out.println(answer);

    }
}
