package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divisor_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {3,2,6};
        int divisor = Integer.parseInt(br.readLine());
        int[] answer = {};
        List<Integer> list_arr = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % divisor == 0)
                list_arr.add(arr[i]);
        }

        answer = new int[list_arr.size()];
        for(int i = 0; i < list_arr.size(); i++)
        {
            answer[i] = list_arr.get(i);
            System.out.println(answer[i]);
        }

        if(list_arr.size() == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);
        System.out.println(answer[0]);
    }
}
