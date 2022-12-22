package BOJ.greedy;

import java.io.*;
import java.util.Stack;

public class zero_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++)
        {
            int num = Integer.parseInt(br.readLine());

            if(num != 0)
            {
                stack.push(num);
            }
            else
            {
                if(stack.isEmpty())
                    continue;
                else
                    stack.pop();
            }
        }

        int sum = 0;
        int size = stack.size();
        for(int i = 0; i < size; i++)
        {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}