package Lv1;

import java.io.*;

public class stringbase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "0123456789";
        boolean answer = true;
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] > 57 || ch[i] < 48 || ch.length < 4 || ch.length > 6 || ch.length == 5)
            {
                answer = false;
            }

        }

        System.out.println(answer);

    }
}
