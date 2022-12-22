package BOJ.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class loseBracket_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("-");

        int result = 0;
        for(int i = 0; i < str.length; i++)
        {
            int sum = 0;

            String[] str2 = str[i].split("\\+");

            for(int j = 0; j < str2.length; j++)
            {
                sum += Integer.parseInt(str2[j]);
            }

            if(i == 0)
            {
                result += sum;
            }
            else
            {
                result -= sum;
            }

        }

        System.out.println(result);

    }
}