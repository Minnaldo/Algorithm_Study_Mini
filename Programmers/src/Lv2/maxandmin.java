package Lv2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class maxandmin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = "";

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -999999;
        int min = 999999;

        ArrayList<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens())
        {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
            if(max < list.get(i))
                max = list.get(i);

            if(min > list.get(i))
                min = list.get(i);
        }

        answer += min + " " + max;
        System.out.println(answer);
    }
}
