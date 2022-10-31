package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class three_reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(n != 0)
        {
            list.add(n % 3);
            n /= 3;

        }

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        int tmp = 1;
        for(int i = list.size()-1; i >= 0; i--)
        {
            answer += list.get(i) * tmp;
            tmp *= 3;
        }

        System.out.println(answer);


    }
}
