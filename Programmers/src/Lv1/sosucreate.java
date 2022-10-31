package Lv1;

import java.io.*;
import java.util.ArrayList;

public class sosucreate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = {1, 2, 3, 4};

        int answer = -1;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++)
        {
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                for (int k = j + 1; k < nums.length; k++)
                {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
            System.out.println(list.get(i));
        }

        answer = 0;
        int[] ct_arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = 2; j <= list.get(i); j++)
            {
                if(list.get(i) % j == 0)
                    ct_arr[i]++;
            }

        }

        for(int i = 0; i < ct_arr.length; i++)
        {
            if(ct_arr[i] == 1)
                answer++;
        }

        System.out.println(answer);

    }

}
