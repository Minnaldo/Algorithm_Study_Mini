package Lv1;

import java.io.*;
import java.util.ArrayList;

public class moeuigosa_search {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answers = {1, 3, 2, 4, 2};

        int[] answer = {};
        int[] supo_1 = {1, 2, 3, 4, 5};
        int[] supo_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int one_index = 0, two_index = 0, three_index = 0;
        int ct_1 = 0, ct_2 = 0, ct_3 = 0;
        for(int i = 0; i < answers.length; i++)
        {
            if(answers[i] == supo_1[one_index])
                ct_1++;
            if(answers[i] == supo_2[two_index])
                ct_2++;
            if(answers[i] == supo_3[three_index])
                ct_3++;

            one_index++;
            two_index++;
            three_index++;

            if(one_index == 5)
                one_index = 0;
            if(two_index == 8)
                two_index = 0;
            if(three_index == 10)
                three_index = 0;
        }

        ArrayList<Integer> list = new ArrayList<>();

        if(ct_1 > ct_2) //1 > 2
        {
            if(ct_2 > ct_3)     // 1>2 && 2>3
                list.add(1);
            else if(ct_2 < ct_3) // 1>2 && 2<3
            {
                if(ct_1 > ct_3)        // 1>2 && 2<3 && 1>3
                    list.add(1);
                else if(ct_1 < ct_3)  // 1>2 && 2<3 && 1<3
                    list.add(3);
                else if(ct_1 == ct_3) // 1>2 && 2<3 && 1==3
                {
                    list.add(1);
                    list.add(3);
                }
            }
            else if(ct_2 == ct_3) // 1>2 && 2==3
                list.add(1);
        }
        else if(ct_2 > ct_3)    // 2 > 3
        {
            if(ct_3 > ct_1)     // 2>3 && 3>1
                list.add(2);
            else if(ct_3 < ct_1)    //2>3 && 3<1
            {
                if(ct_2 > ct_1)     //2>3 && 3<1 && 2>1
                    list.add(2);
                else if(ct_2 < ct_1)    //2>3 && 3<1 && 2<1
                    list.add(1);
                else if(ct_2 == ct_1)   //2>3 && 3<1 && 2==1
                {
                    list.add(1);
                    list.add(2);
                }
            }
            else if(ct_3 == ct_1)   //2>3 && 3==1
                list.add(2);
        }
        else if(ct_3 > ct_1)    //3 > 1
        {
            if(ct_1 > ct_2)     //3>1 && 1>2
                list.add(3);
            else if(ct_1 < ct_2)    //3>1 && 1<2
            {
                if(ct_3 > ct_2)     //3>1 && 1<2 && 3>2
                    list.add(3);
                else if(ct_3 < ct_2)    //3>1 && 1<2 && 3<2
                    list.add(2);
                else if(ct_3 == ct_2)   //3>1 && 1<2 && 3==2
                {
                    list.add(2);
                    list.add(3);
                }
            }
            else if(ct_1 == ct_2)   //3>1 && 1==2
                list.add(3);
        }

        if(ct_1 == ct_2 && ct_2 == ct_3)
        {
            list.add(1);
            list.add(2);
            list.add(3);
        }


        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


    }
}
