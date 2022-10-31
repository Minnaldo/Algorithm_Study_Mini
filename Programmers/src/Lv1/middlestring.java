package Lv1;

import java.io.*;

public class middlestring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String answer = "";
        char[] ch = s.toCharArray();

        if(s.length() % 2 == 1)
        {
            answer = String.valueOf(ch[s.length()/2]);
        }
        else
        {
            answer = String.valueOf(ch[s.length()/2-1]) + String.valueOf(ch[s.length()/2]);
        }

        System.out.println(answer);

    }
}
