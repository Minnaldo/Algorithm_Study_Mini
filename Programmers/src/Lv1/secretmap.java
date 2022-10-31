package Lv1;

import java.io.*;
import java.util.*;

public class secretmap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 6;
        int[] arr1 = {8, 33, 33 ,22, 31, 50};
        int[] arr2 = {8 ,56, 19, 14, 14, 10};

        String[] answer = {};
        answer = new String[n];

        int[][] chk_arr = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            int num = arr1[i] | arr2[i];

            Stack<Integer> stack = new Stack<>();
            for(int l = 0; l < n; l++)
            {
                stack.add(num%2);
                num /= 2;
            }

            String result = "";
            for(int j = 0; j < n; j++)
            {
                chk_arr[i][j] = stack.pop();

                if(chk_arr[i][j] == 1)
                    result += "#";
                else
                    result += " ";
            }

            answer[i] = result;
            System.out.print(answer[i]);
            System.out.println();
        }

    }
}
