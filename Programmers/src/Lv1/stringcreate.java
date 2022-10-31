package Lv1;

import java.io.*;
import java.util.Locale;

public class stringcreate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "try hello  world";
        String answer = "";

        String[] string_arr = s.split(" ");
        int index = 0;

        for(int i = 0; i < string_arr.length; i++)
        {
            char[] ch_arr = string_arr[i].toCharArray();
            if(string_arr[i].equals(" "))
            {
                answer += " ";
            }
            else
            {
                for(int j = 0; j < string_arr[i].length(); j++)
                {
                    String change_ch = String.valueOf(ch_arr[j]);
                    if (j % 2 == 0)
                    {
                        answer += change_ch.toUpperCase();
                    }
                    else
                    {
                        answer += change_ch.toLowerCase();
                    }

                    index++;
                }
            }

            answer += " ";
        }

        System.out.println(answer);
    }
}