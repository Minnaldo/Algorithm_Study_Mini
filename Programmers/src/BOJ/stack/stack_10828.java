package BOJ.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push"))
            {
               stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop"))
            {
                if(stack.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            }
            else if(str.equals("size"))
            {
                System.out.println(stack.size());
            }
            else if(str.equals("empty"))
            {
                if(stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(str.equals("top"))
            {
                if(stack.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }

        }

    }
}
