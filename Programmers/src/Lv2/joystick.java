package Lv2;

import java.io.*;

public class joystick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String name = "JEROEN";

        int answer = 0;

        int length = name.length();
        int index = 0;
        int min = length - 1;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            //상, 하 이동
            int move = (ch - 'A' < 'Z' - ch + 1) ? (ch - 'A') : ('Z' - ch + 1);

            answer += move;

            //좌, 우 이동
            int nextIndex = i + 1;

            // 다음 단어가 A이고, 단어가 끝나기 전까지 nextIndex 증가
            while (nextIndex < length && name.charAt(nextIndex) == 'A')
                nextIndex++;

            min = Math.min(min, (i * 2) + length - nextIndex);
        }

        answer += min;

        System.out.println(answer);
    }
}
