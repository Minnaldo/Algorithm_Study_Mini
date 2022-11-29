package Lv2;

import java.io.*;

public class nextbignumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 15;

        int answer = 0;

        int one_count = 0;
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '1')
                one_count++;
        }

        int n_clone = n;
        while(true)
        {
            int result = 0;
            n_clone++;

            String str_2 = Integer.toBinaryString(n_clone);
            for(int i = 0; i < str_2.length(); i++)
            {
                char ch_2 = str_2.charAt(i);
                if(ch_2 == '1')
                    result++;
            }

            if(result == one_count) {
                answer = n_clone;
                break;
            }
        }

        System.out.println(answer);
    }
}
