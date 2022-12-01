package Lv1;

import java.io.*;
import java.util.Arrays;

public class gymclothes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int result = 0;

        int answer = 0;

        result = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if(lost[i] == reserve[j])
                {
                    result++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if((reserve[j] == lost[i] - 1) || (reserve[j] == lost[i] + 1))
                {
                    result++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        answer = result;

        System.out.println(answer);

    }
}
