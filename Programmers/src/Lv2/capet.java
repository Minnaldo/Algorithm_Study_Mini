package Lv2;

import java.io.*;
import java.util.ArrayList;

public class capet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int brown = Integer.parseInt(br.readLine());
        int yellow = Integer.parseInt(br.readLine());

        int[] answer = {};

        int sum = brown + yellow;

        int[] yaksu = new int[sum];
        ArrayList<Integer> yaksu_list = new ArrayList<>();
        for(int i = 1; i <= sum; i++)
        {
            if(sum % i == 0) {
                yaksu_list.add(i);
            }
        }

        answer = new int[2];
        if(yaksu_list.size() % 2 == 0)
        {
            answer[0] = yaksu_list.get((yaksu_list.size()/2));
            answer[1] = yaksu_list.get((yaksu_list.size()/2)-1);
        }
        else
        {
            answer[0] = yaksu_list.get((yaksu_list.size()/2));
            answer[1] = yaksu_list.get((yaksu_list.size()/2));
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);


    }
}
