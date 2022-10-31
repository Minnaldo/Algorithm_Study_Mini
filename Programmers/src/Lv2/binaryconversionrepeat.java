package Lv2;

import java.io.*;
import java.util.ArrayList;

public class binaryconversionrepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String s = br.readLine();

        int[] answer = {};

        int cnt = 0;
        int zero_cnt = 0;
        while(!s.equals("1"))
        {
            ArrayList<Character> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '1')
                {
                    list.add(s.charAt(i));
                }
                else
                {
                    zero_cnt++;
                }
            }


            int x_length = list.size();
            s = Integer.toBinaryString(x_length);
            cnt++;

            System.out.println(s);
        }

        answer = new int[2];
        answer[0] = cnt;
        answer[1] = zero_cnt;

        System.out.println("cnt : " + cnt);
        System.out.println("zero_cnt : " + zero_cnt);


    }
}
