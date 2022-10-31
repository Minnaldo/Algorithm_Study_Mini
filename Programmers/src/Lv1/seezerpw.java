package Lv1;

import java.io.*;

public class seezerpw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        String answer = "";
//        System.out.println((int)'a');   //97
//        System.out.println((int)'z');   //122
//        System.out.println((int)'A');   //65
//        System.out.println((int)'Z');   //90

        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            int result = ch[i] + n;
            if(ch[i] == ' ')
                result = ch[i];
            else if(ch[i] >= 97 && ch[i] <= 122 && result > 122)
                result -= 26;
            else if(ch[i] >= 65 && ch[i] <= 90 && result > 90)
                result -= 26;

            answer += (char) (result);
        }

        System.out.println(answer);

    }
}
