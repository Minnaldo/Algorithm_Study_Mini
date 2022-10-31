package Lv1;

import java.io.*;
import java.util.Locale;

public class pro_string {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean answer = true;

        String str = "Pyy";
        String lowerstr = str.toLowerCase();

        int p_ct = 0;
        int y_ct = 0;

        char[] charstr = new char[lowerstr.length()];

        for(int i = 0; i < lowerstr.length(); i++)
        {
            if(lowerstr.charAt(i) == 'p')
                p_ct++;
            else if(lowerstr.charAt(i) == 'y')
                y_ct++;
        }

        if(p_ct == y_ct)
            answer = true;
        else
            answer = false;

        System.out.println(answer);
    }
}
