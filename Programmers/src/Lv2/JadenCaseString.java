package Lv2;

import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class JadenCaseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "3people  2Unfollowed Me  ";

        String result = "";
        String answer = "";

        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++)
        {
            if(s.substring(s.length() - 1, s.length()).equals(" ")) {
                str[str.length-1] += " ";
                s = s.substring(0, s.length()-1);
            }

            if(str[i].equals(""))
            {
                result += " ";
            }

            else
            {
                str[i] = str[i].toUpperCase(Locale.ROOT);
                result += str[i].charAt(0);

                str[i] = str[i].toLowerCase(Locale.ROOT);
                for (int j = 1; j < str[i].length(); j++) {
                    result += str[i].charAt(j);
                }

                result += " ";
            }
        }

        for(int i = 0; i < result.length()-1; i++)
        {
            answer += result.charAt(i);
        }




        System.out.println(answer);


    }
}
