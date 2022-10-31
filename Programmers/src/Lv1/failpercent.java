package Lv1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dataa{
    int index;
    double value;
    int name;
    int size;
    int v2;

    public Dataa(Double aDouble, int i) {
        index = i;
        value = aDouble;
    }
}

public class failpercent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] stages = {1, 1, 1, 1, 1};
        int N = 4;

        int[] answer = {};

        int[] fail_chk = new int[N+2];

        for(int i = 0; i < stages.length; i++)
        {
            fail_chk[stages[i]]++;
        }

        int length = stages.length;
        ArrayList<Double> list = new ArrayList<>();
        for(int i = 1; i <= N; i++)
        {
            if(length == 0)
                list.add(0.0);
            else
                list.add((double)fail_chk[i]/(double)length);
            length -= fail_chk[i];
        }

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

//        ArrayList<Integer> result_list = new ArrayList<>();
//
//        double max = -999999;
//        while(result_list.size() != list.size())
//        {
//            for(int i = 0; i < list.size(); i++)
//            {
//                if(max < list.get(i))
//                    max = list.get(i);
//            }
//
//            for(int i = 0; i < list.size(); i++) {
//                if(max == list.get(i))
//                {
//                    result_list.add(i);
//                    list.set(i, (double) -1);
//                }
//            }
//            max = -999999;
//        }

        List<Dataa> list1 = new ArrayList<>();

        for(int i = 0; i < list.size(); i++)
        {
            list1.add(new Dataa(list.get(i), i+1));
        }

        Collections.sort(list1, new Comparator<Dataa>() {
            @Override
            public int compare(Dataa o1, Dataa o2) {
                return Double.compare(o2.value, o1.value);
            }
        });

        for(int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }

        answer = new int[list1.size()];
        for(int i = 0; i < list1.size(); i++)
        {
            answer[i] = list1.get(i).index;
            System.out.println(answer[i]);
        }



//        answer = new int[result_list.size()];
//        for(int i = 0; i < result_list.size(); i++)
//        {
//            answer[i] = result_list.get(i) + 1;
////            System.out.println(answer[i]);
//        }

    }
}
