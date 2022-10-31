package Lv1;

import java.io.*;

public class pro_plus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int m = n;

        while(true)
        {
            sum += n % 10;

            if(n / 10 == 0)
            {
                System.out.println(sum);
                return;
            }

            n = n / 10;
        }

    }
}
