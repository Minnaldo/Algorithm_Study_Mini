package Lv2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class min_create {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int[] A = {1, 2};
        int[] B = {3, 4};

        int answer = 0;

        int[] B_reverse = new int[B.length];

        Arrays.sort(A);
        Arrays.sort(B);

        int ct = 0;
        for(int i = B.length-1; i >= 0; i--)
        {
            B_reverse[ct] = B[i];
            ct++;
        }

        int sum = 0;
        for(int i = 0; i < A.length; i++)
        {
            sum += A[i] * B_reverse[i];
        }

        System.out.println(sum);

        sum = answer;

    }
}
