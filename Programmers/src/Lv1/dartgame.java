package Lv1;

import java.io.*;

public class dartgame {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String dartResult = "1S*2T*3S";

        int answer = 0;

        char[] ch_arr = dartResult.toCharArray();

//        ch_arr[i] : 1 = 1
//        ch_arr[i] : D = 20
//        ch_arr[i] : 2 = 2
//        ch_arr[i] : S = 35
//        ch_arr[i] : # = -13
//        ch_arr[i] : * = -6
//        ch_arr[i] : 1 = 1
//        ch_arr[i] : 0 = 0
//        ch_arr[i] : T = 36

        int score_index = 0;
        double[] score_arr = new double[5];
        int[] option_arr = new int[4];
        for(int i = 0; i < ch_arr.length; i++)
        {
            /* Score */
            if((ch_arr[i]-'0') >= 0 && (ch_arr[i]-'0') <= 9 )
            {
                score_index++;
                if((ch_arr[i]-'0') == 1 && (ch_arr[i+1]-'0') == 0)
                {
                    score_arr[score_index] = 10;
                    i++;
                }
                else
                    score_arr[score_index] = (ch_arr[i]-'0');
            }


            /* Bonus */
            if((ch_arr[i]-'0') == 35)   //Single(S)
            {
                score_arr[score_index] = Math.pow(score_arr[score_index], 1);
            }
            else if((ch_arr[i]-'0') == 20)  //Double(D)
            {
                score_arr[score_index] = Math.pow(score_arr[score_index], 2);
            }
            else if((ch_arr[i]-'0') == 36)  //Tirple(T)
            {
                score_arr[score_index] = Math.pow(score_arr[score_index], 3);
            }


            /* Option */
            if((ch_arr[i]-'0') == -6)
            {
                //option 배열에 값을 담는다.
                option_arr[score_index] = (ch_arr[i]-'0');

                //score 배열에 스타상(*) 옵션이니, 바로 전 값과 현재 값을 *2 값을 해준다.
                score_arr[score_index-1] = score_arr[score_index-1] * 2;
                score_arr[score_index] = score_arr[score_index] * 2;
            }
            else if((ch_arr[i]-'0') == -13)
            {
                //option 배열에 값을 담는다.
                option_arr[score_index] = (ch_arr[i]-'0');

                //score 배열에 스타상(*) 옵션이니, -1 값을 해준다.
                score_arr[score_index] = score_arr[score_index] * (-1);
            }

        }

        for(int i = 0; i < score_arr.length; i++)
        {
            answer += score_arr[i];
        }

        System.out.println(answer);
    }
}
