package Lv1;

import java.io.*;

public class lotto_minrank_maxrank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] answer = {};

        int cnt = 0;
        int zero_cnt = 0;
        for(int i = 0; i < lottos.length; i++)
        {
            if(lottos[i] == 0)
                zero_cnt++;

            for(int j = 0; j < win_nums.length; j++)
            {
                if(lottos[i] == win_nums[j])
                {
                    cnt++;
                }
            }

        }

        answer = new int[2];

        int max = zero_cnt + cnt;
        int min = cnt;
        System.out.println("max : " + max);
        System.out.println("min : " + min);

        switch (max)
        {
            case 0:
                answer[0] = 6;
                break;
            case 1:
                answer[0] = 6;
                break;
            case 2:
                answer[0] = 5;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 6:
                answer[0] = 1;
                break;
        }

        switch (min)
        {
            case 0:
                answer[1] = 6;
                break;
            case 1:
                answer[1] = 6;
                break;
            case 2:
                answer[1] = 5;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 6:
                answer[1] = 1;
                break;
        }

        for(int i = 0; i < answer.length; i++)
        {
            System.out.println(answer[i]);
        }

    }
}
