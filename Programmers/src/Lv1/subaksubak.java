package Lv1;

import java.io.*;

public class subaksubak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String answer = "";

        int count = 0;
        while(count != n)
        {
            if(count % 2 == 0)
            {
                count++;
                answer += "수";
            }
            else
            {
                count++;
                answer += "박";
            }
        }

        System.out.println(answer);

    }
}
