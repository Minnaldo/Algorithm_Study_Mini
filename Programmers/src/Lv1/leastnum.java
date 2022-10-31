package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class leastnum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {4, 3, 2, 1};
        int[] answer = {};

        if(arr.length == 1)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            ArrayList<Integer> arr_list = new ArrayList<>();

            int[] answer_clone = arr.clone();
            int min = 100000;
            Arrays.sort(answer_clone);
            min = answer_clone[0];
            int ct = arr.length;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    ct--;
                    continue;
                }
                arr_list.add(arr[i]);
            }

            answer = new int[ct];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr_list.get(i);
                System.out.println(answer[i]);
            }
        }


//테라브레스
    }
}
