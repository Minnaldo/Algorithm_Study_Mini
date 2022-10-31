package Lv1;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class stringdesc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "Zbcdefg";
        String[] str = s.split("");
        String answer = "";

        Arrays.sort(str, Collections.reverseOrder());

        for(int i = 0; i < str.length; i++)
        {
            answer += str[i];
        }

        System.out.println(answer);
    }
}
