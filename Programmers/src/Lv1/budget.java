package Lv1;

import java.io.*;
import java.util.Arrays;

public class budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] d = {2, 2, 3, 3};
        int budget = 10;


        int answer = 0;
        Arrays.sort(d);

        int sum = 0;
        int ct = 0;
        for(int i = 0; i < d.length; i++)
        {
            sum += d[i];

            if(sum > budget)
            {
                break;
            }

            ct++;
        }
        answer = ct;

        System.out.println(ct);

    }
}
