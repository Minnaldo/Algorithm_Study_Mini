package BOJ.queue;

import java.io.*;
import java.util.LinkedList;

public class card2_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++)
        {
            queue.add(i);
        }

        while(queue.size() != 1)
        {
            queue.pop();

            int num = queue.pop();

            queue.addLast(num);
        }

        System.out.println(queue.pop());

    }
}