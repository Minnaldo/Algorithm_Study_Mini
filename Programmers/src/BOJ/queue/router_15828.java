package BOJ.queue;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class router_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        while(true)
        {
            int num = Integer.parseInt(br.readLine());

            if(num == -1)
                break;

            if(num == 0) {
                queue.poll();
                continue;
            }

            if(queue.size() >= N)
                continue;
            else
                queue.add(num);
        }


        if(queue.isEmpty())
            System.out.println("empty");
        else
        {
            while (queue.size() != 0) {
                System.out.println(queue.poll());
            }
        }

    }
}