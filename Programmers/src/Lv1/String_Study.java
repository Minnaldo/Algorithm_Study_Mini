package Lv1;

import java.io.*;

public class String_Study {

    static String str;
    static char[] words;
    static int[] alphabet = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        str = br.readLine();

        for(int i = 0; i < 26; i++)
            alphabet[i] = -1;

        words = str.toCharArray();

        for(int i = 0; i < words.length; i++)
        {
            int temp = words[i] - 'a';
            if(alphabet[temp] == -1)
                alphabet[temp] = i;
        }

        for(int i = 0; i < 26; i++)
        {
            System.out.print(alphabet[i] + " ");
        }

    }
}
