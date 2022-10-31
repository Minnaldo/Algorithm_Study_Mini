package Lv1;

import java.io.*;

public class kimhusband {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = "";
        String[] seoul = { "Jane", "Kim" };

        for(int i = 0; i < seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {
                System.out.println("김서방은 " + i + "에 있다");
            }
        }


    }
}
