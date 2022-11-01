package Lv2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class pairdelete {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String s = br.readLine();

        int answer = -1;

        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(stack.isEmpty())
            {
                stack.push(ch);
            }
            else if(stack.peek() == ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }

        }

        if(stack.size() == 0)
            answer = 1;
        else
            answer = 0;

        System.out.println(answer);
    }
}
