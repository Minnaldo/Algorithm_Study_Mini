package BOJ.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class treasure_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
        {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
        {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        Arrays.sort(B, Collections.reverseOrder());

        int result = 0;
        for(int i = 0; i < N; i++)
        {
            result += A[i] * B[i];
        }

        System.out.println(result);

    }
}
