package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public class samenumno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {};
        ArrayList<Integer> list_arr = new ArrayList<>();

        int ct = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(i > 0) {
                if (arr[i] == arr[i - 1])
                    ct++;
                else
                    ct = 0;
            }

            if(ct == 0)
            {
                list_arr.add(arr[i]);
            }
        }
        System.out.println(list_arr);

        answer = new int[list_arr.size()];
        for(int i = 0; i < list_arr.size(); i++)
        {
            answer[i] = list_arr.get(i);
            System.out.println(answer[i]);
        }


    }
}
