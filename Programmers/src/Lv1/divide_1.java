package Lv1;

import java.io.*;

public class divide_1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i < n; i++)
        {
            if(n % i == 1)
            {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
