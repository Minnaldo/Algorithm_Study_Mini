package Lv1;

import java.io.*;

public class leastsquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] size = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int answer = 0;

        int too_max = 0;
        int too_min = 0;

        int max = 0;
        int min = 0;
        for(int i = 0; i < size.length; i++)
        {
            max = size[i][0];
            min = size[i][1];

            int temp = 0;
            if(min > max)
            {
                temp = max;
                max = min;
                min = temp;
            }

            if(max > too_max)
                too_max = max;

            if(min > too_min)
                too_min = min;
        }
        answer = too_max * too_min;

        System.out.println(answer);


    }
}
