package Lv1;

import java.io.*;
import java.util.Arrays;

public class K_num {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = {};
        int[] arr_sort = {};

        answer = new int[commands.length];

        int i = 0;
        int j = 0;
        int k = 0;
        for(int a = 0; a < commands.length; a++)
        {
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];

            arr_sort = new int[j - i + 1];
            int num = 0;
            for(int b = i-1; b < j; b++)
            {
                arr_sort[num] = array[b];
                num++;
            }

            Arrays.sort(arr_sort);


            answer[a] = arr_sort[k-1];

            System.out.println(answer[a]);

        }

    }
}
