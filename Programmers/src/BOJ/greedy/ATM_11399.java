package BOJ.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum = arr[0];
        int result = sum;
        for(int i = 1; i < N; i++)
        {
            sum += arr[i];
            result += sum;
        }

        System.out.println(result);

    }
}
