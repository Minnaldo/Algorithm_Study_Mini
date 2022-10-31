package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pro_jungsu_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long answer = 0;
        long n;
        long num = 0;

        n = Long.parseLong(br.readLine());

        List<Integer> arr = new ArrayList<>();

        while(n > 0)
        {
            num = n % 10;
            arr.add((int) num);
            n = n / 10;
        }

        Collections.sort(arr);

        String str = "";
        for(int i = arr.size() - 1; i >= 0; i--)
        {
            str += String.valueOf(arr.get(i));
        }

        answer = Long.parseLong(str);

        System.out.println(answer);
    }
}
