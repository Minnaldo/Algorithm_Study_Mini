package Lv2;

import java.io.*;

public class joystick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String name = "JEROEN";

        int answer = 0;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(ch - 'A' == 13)
            {
                answer += 13;
            }
            else if(ch - 'A' < 13)
            {
                answer += ch - 'A';
            }
            else if(ch - 'A' > 13)
            {
                answer += 'Z' - ch + 1;
            }

        }

        System.out.println(answer);
    }
}
