package Lv2;

import java.io.*;
import java.util.Stack;

public class alright_gwalho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        String s = br.readLine();

        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch =  s.charAt(i);

            if(ch == '(')
                stack.push(ch);
            else if(ch == ')')
            {
                if(stack.size() == 0)
                {
                    stack.push(ch);
                }
                else
                {
                    if(stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(ch);
                }
            }
        }

        if(stack.size() == 0)
            answer = true;
        else
            answer = false;

        System.out.println(answer);

    }
}
