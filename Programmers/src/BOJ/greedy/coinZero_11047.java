package BOJ.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class coinZero_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int count = 0;

        for(int i = 0; i < N; i++)
        {
            if(K >= arr[i])
            {
                count += K / arr[i];
                K %= arr[i];
            }
        }

        System.out.println(count);
    }
}