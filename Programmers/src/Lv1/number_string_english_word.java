package Lv1;

import java.io.*;

public class number_string_english_word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int answer = 0;
        String str_answer = "";

        String result = "";

        char[] ch = new char[s.length()];
        ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if((int)ch[i] >= 97 && (int)ch[i] <= 122)
                result += ch[i];

            if((int)ch[i] >= 48 && (int)ch[i] <= 57)
                str_answer += ch[i];


            if(result.equals("zero")) {
                str_answer += 0;
                result = "";
            }
            else if(result.equals("one")) {
                str_answer += 1;
                result = "";
            }
            else if(result.equals("two")) {
                str_answer += 2;
                result = "";
            }
            else if(result.equals("three"))
            {
                str_answer += 3;
                result = "";
            }
            else if(result.equals("four")) {
                str_answer += 4;
                result = "";
            }
            else if(result.equals("five")) {
                str_answer += 5;
                result = "";
            }
            else if(result.equals("six")) {
                str_answer += 6;
                result = "";
            }
            else if(result.equals("seven")) {
                str_answer += 7;
                result = "";
            }
            else if(result.equals("eight")) {
                str_answer += 8;
                result = "";
            }
            else if(result.equals("nine")) {
                str_answer += 9;
                result = "";
            }
        }

        answer = Integer.parseInt(str_answer);

        System.out.println(answer);

        //a : 97
        //z : 122
        //0 : 48
        //1 : 49
        //9 : 57


    }
}
