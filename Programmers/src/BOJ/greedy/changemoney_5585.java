package BOJ.greedy;

import java.io.*;

public class changemoney_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int changeMoney = 1000 - num;
        int result = 0;
        int count = 0;

        while(true)
        {
            if(changeMoney == 0)
                break;

            if (changeMoney >= 500)
            {
                changeMoney -= 500;
                count++;
            }
            else if(changeMoney < 500 && changeMoney >= 100)
            {
                changeMoney -= 100;
                count++;
            }
            else if(changeMoney < 100 && changeMoney >= 50)
            {
                changeMoney -= 50;
                count++;
            }
            else if(changeMoney < 50 && changeMoney >= 10)
            {
                changeMoney -= 10;
                count++;
            }
            else if(changeMoney < 10 && changeMoney >= 5)
            {
                changeMoney -= 5;
                count++;
            }
            else if(changeMoney < 5 && changeMoney >= 1)
            {
                changeMoney -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
