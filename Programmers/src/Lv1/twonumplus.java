package Lv1;

import java.io.*;
import java.util.*;

public class twonumplus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = {2, 1, 3, 4, 1};

        int[] answer = {};

        HashSet<Integer> set_list = new HashSet<>();

        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                set_list.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set_list.size()];
        int ct = 0;
        Iterator<Integer> iterator = set_list.iterator();
        while(iterator.hasNext())
        {
            answer[ct] = iterator.next();
            ct++;
        }

        Arrays.sort(answer);

        for(int i = 0; i < answer.length; i++)
        {
            System.out.println(answer[i]);
        }

    }
}
