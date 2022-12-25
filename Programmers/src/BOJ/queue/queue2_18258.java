package BOJ.queue;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue2_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push"))
            {
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop"))
            {
                if(queue.isEmpty())
                    bw.write(-1 + "\n");
//                    System.out.println(-1);
                else
                    bw.write(queue.poll() + "\n");
//                    System.out.println(queue.poll());
            }
            else if(str.equals("size"))
            {
                bw.write(queue.size() + "\n");
//                System.out.println(queue.size());
            }
            else if(str.equals("empty"))
            {
                if(queue.isEmpty())
                    bw.write(1 + "\n");
//                    System.out.println(1);
                else
                    bw.write(0 + "\n");
//                    System.out.println(0);
            }
            else if(str.equals("front"))
            {
                if(queue.isEmpty())
                    bw.write(-1 + "\n");
//                    System.out.println(-1);
                else
                    bw.write(queue.peek() + "\n");
//                    System.out.println(queue.peek());
            }
            else if(str.equals("back"))
            {
                if(queue.isEmpty())
                    bw.write(-1 + "\n");
//                    System.out.println(-1);
                else
                {
                    bw.write(queue.peekLast() + "\n");
//                    System.out.println(queue.peekLast());
                }
            }
        }

        bw.flush();
        bw.close();

    }
}
