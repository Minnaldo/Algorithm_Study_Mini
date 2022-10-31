package Lv1;

import java.io.*;

public class hashad_num {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean answer = true;

        int x = Integer.parseInt(br.readLine());
        int num = x;
        int sum = 0;

        while(x > 0)
        {
            sum += x % 10;
            x = x / 10;
        }

        if(num % sum == 0)
        {
            answer = true;
        }
        else
            answer = false;

        System.out.println(answer);

    }
}
