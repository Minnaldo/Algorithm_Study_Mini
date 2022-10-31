package Lv1;

import java.io.*;
import java.util.Arrays;

public class stringmymind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] answer = {};
        answer = new String[strings.length];
        char[] ch = new char[strings.length];
        for(int i = 0; i < strings.length; i++)
        {
            ch[i] = strings[i].charAt(n);
        }

        Arrays.sort(ch);
        Arrays.sort(strings);

        int[] chk = new int[strings.length];
        for(int i = 0; i < ch.length; i++)
        {
            for(int j = 0; j < strings.length; j++)
            {
                if (ch[i] == strings[j].charAt(n) && chk[j] == 0)
                {
                    answer[i] = strings[j];
                    chk[j] = 1;
                    break;
                }
            }
        }

        for(int i = 0; i < answer.length; i++)
        {
            System.out.println(answer[i]);
        }

    }
}
