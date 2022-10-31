package Lv1;

import java.io.*;
import java.util.Stack;

public class gwalho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String s = br.readLine();

        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(s.charAt(i) == '(')
            {
                stack.push(ch);
            }
            else if(s.charAt(i) == ')')
            {
                if(stack.isEmpty())
                {
                    answer = false;
                    break;
                }
                else
                {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty())
        {
            answer = false;
        }

        System.out.println(answer);

    }
}
