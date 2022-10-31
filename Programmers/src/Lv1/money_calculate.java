package Lv1;

import java.io.*;

public class money_calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int price = Integer.parseInt(br.readLine());
        int money = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        long answer = -1;
        answer = 0;

        for(int i = 1; i <= count; i++)
        {
            answer += price * i;
        }

        if(answer > money)
            answer -= money;
        else
            answer = 0;

        System.out.println(answer);

    }
}
