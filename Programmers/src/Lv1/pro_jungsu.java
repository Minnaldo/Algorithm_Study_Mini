package Lv1;

import java.io.*;
import java.util.Arrays;

public class pro_jungsu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long answer = 0;
        int[] arr = {};
        long num = 0;
        int cnt = 0;

        long n = Long.parseLong(br.readLine());
        num = n;

        while(n > 0)
        {
            cnt++;
            n = n / 10;
        }

        arr = new int[cnt];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);

        String str = "";
        for(int i = arr.length - 1; i >= 0; i--)
        {
            str += arr[i];
        }

        answer = Long.parseLong(str);

    }
}
