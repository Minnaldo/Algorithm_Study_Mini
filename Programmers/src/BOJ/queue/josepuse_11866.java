package BOJ.queue;

import java.io.*;
import java.util.LinkedList;

public class josepuse_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++)
        {
            queue.add(i);
        }

        int cnt = 0;
        while(!queue.isEmpty())
        {
            cnt++;

            bw.write("<");
            if(cnt == K)
            {
                bw.write(queue.poll());
            }

            

            bw.write(", ");

        }

    }
}