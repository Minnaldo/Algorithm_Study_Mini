package Lv1;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class report_result_response {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;

        int[] answer = {};

        int[][] arr_list = new int[id_list.length][id_list.length];

        for(int i = 0; i < report.length; i++)
        {
            StringTokenizer st = new StringTokenizer(report[i]);

            String id_reporter = st.nextToken();
            for(int j = 0; j < id_list.length; j++)
            {
                //신고자 id_list에서 찾기
                if(id_reporter.equals(id_list[j]))
                {
                    String bad_user = st.nextToken();
                    //신고 당한자 id_list에서 찾기
                    for(int l = 0; l < id_list.length; l++)
                    {
                        if(bad_user.equals(id_list[l]))
                        {
                            if(arr_list[j][l] == 0)
                                arr_list[j][l]++;
                        }

                        System.out.println("arr_list["+j+"]["+l+"] : " + arr_list[j][l]);
                    }

                }
            }
        }


        int[] result = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++)
        {
            for (int j = 0; j < id_list.length; j++)
            {
                result[i] += arr_list[j][i];

            }
            System.out.println("result["+i+"] : " + result[i]);
        }


        answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++)
        {
            if(result[i] >= k)
            {
                for (int j = 0; j < id_list.length; j++)
                {
                    if(arr_list[j][i] == 1)
                    {
                        answer[j]++;
                        System.out.println("arr_list["+j+"]["+i+"] : " + arr_list[j][i]);
                    }
                }
            }
        }

        for(int i = 0; i < id_list.length; i++)
        {
            System.out.println(answer[i]);
        }

    }
}
