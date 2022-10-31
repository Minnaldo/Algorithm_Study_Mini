package Lv1;

import java.io.*;

public class rowcol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {5}};
        int[][] answer = {};


        answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }


    }
}
