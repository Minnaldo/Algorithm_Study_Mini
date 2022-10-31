package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class new_id {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String new_id = "abcdefghijklmn.p";

        String answer = "";

        //1단계 - 소문자로 치환
        new_id = new_id.toLowerCase(Locale.ROOT);
        char[] ch = new_id.toCharArray();

        ArrayList<Character> char_list = new ArrayList<Character>();

        for(int i = 0; i < ch.length; i++)
        {
            char_list.add(ch[i]);
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("1 stage end");

        //2단계 - 특수문자 제거
        for(int i = 0; i < char_list.size(); i++)
        {
            if((char_list.get(i) >= 'a' && char_list.get(i) <= 'z') || (char_list.get(i) - '0' >= 0 && char_list.get(i) - '0' <= 9) || char_list.get(i).equals('-') || char_list.get(i).equals('_') || char_list.get(i).equals('.'))
            {

            }
            else
            {
                char_list.remove(i);
                i--;
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("2 stage end");

        //3단계 - 마침표(.) 2번 이상 연속 제거.
        for(int i = 0; i < char_list.size()-1; i++)
        {
            if(char_list.get(i).equals('.') && char_list.get(i).equals(char_list.get(i+1)))
            {
                char_list.remove(i + 1);
                i--;
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("3 stage end");

        //4단계 - 마침표(.) 처음과 끝이면 제거.
        if(char_list.get(0).equals('.'))
        {
            char_list.remove(0);
        }

        if(char_list.size() > 1) {
            if (char_list.get(char_list.size() - 1).equals('.')) {
                char_list.remove(char_list.size() - 1);
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("4 stage end");

        //5단계
        if(char_list.isEmpty())
        {
            char_list.add('a');
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("5 stage end");

        //6단계 - 16자 이상이면, 문자 제거
        if(char_list.size() >= 16)
        {
            for(int i = 15; i < char_list.size(); i++)
            {
                char_list.remove(i);
                i--;
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("6 stage end");


        //7단계 - 길이가 2자 이하라면, new_id의 마지막 문자를 길이가 3이 될때까지 반복.
        if(char_list.size() <= 2)
        {
            while(char_list.size() != 3)
            {
                char_list.add(char_list.get(char_list.size()-1));
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            System.out.print(char_list.get(i));
        }
        System.out.println();
        System.out.println("7 stage end");

        //4단계 반복 - 마침표(.) 처음과 끝이면 제거.
        if(char_list.get(0).equals('.'))
        {
            char_list.remove(0);
        }

        if(char_list.size() > 1) {
            if (char_list.get(char_list.size() - 1).equals('.')) {
                char_list.remove(char_list.size() - 1);
            }
        }

        for(int i = 0; i < char_list.size(); i++)
        {
            answer += char_list.get(i);
        }

        System.out.println(answer);


    }
}
