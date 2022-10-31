package Lv1;

import java.io.*;

public class naejuck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        int answer = 1234567890;
        answer = 0;

        for(int i = 0; i < a.length; i++)
        {
            answer += a[i] * b[i];
        }

        System.out.println(answer);

    }
}
