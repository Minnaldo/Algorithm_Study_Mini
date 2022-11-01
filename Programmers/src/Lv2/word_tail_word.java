package Lv2;

import java.io.*;

public class word_tail_word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int[] answer = {};

        answer = new int[n];
        int cnt = 0;
        for(int i = 0; i < words.length-1; i++)
        {
            if(words[i].charAt(words[i].length()-1) == words[i+1].charAt(0))
            {
                answer[0] = cnt / n + 1;
            }
            else
            {
                int sequence = (cnt + 1) % n;
                if(sequence == 0)
                    sequence = n;

                answer[1] = sequence;
                break;
            }

            cnt++;
        }

        System.out.println("answer[0] : " + answer[0]);
        System.out.println("answer[1] : " + answer[1]);

    }
}
