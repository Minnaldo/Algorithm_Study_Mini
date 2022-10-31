package Lv2;

import java.io.*;
import java.util.ArrayList;

public class pibonachinumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 100000;

        int answer = 0;

        int[] arr = new int[n+1];
        int[] result = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++)
        {
            arr[i] = (arr[i-2] % 1234567) + (arr[i-1] % 1234567);
            result[i] = ((arr[i-2]) + (arr[i-1])) % 1234567;
        }

        answer = result[n] ;

        System.out.println(answer);

    }
}
