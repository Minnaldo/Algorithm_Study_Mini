package IM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 비밀번호_SWEA_1234_second {

	static int T;
	static int N;

	static ArrayList<Character> list;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));


		T = 10;
		for(int tc = 1; tc <= 10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			String str = st.nextToken();

			list = new ArrayList<>();

			for(int i = 0; i < str.length(); i++) {
				list.add(str.charAt(i));
			}

			int idx = 0;
			while(true) {
				if(idx == list.size()-1)
					break;


				if(list.get(idx) == list.get(idx+1)) {
					list.remove(idx);
					list.remove(idx);
					idx--;
					if(idx < 0)
						idx = 0;
					continue;
				}
				idx++;
			}
			
			bw.write("#" + tc + " ");
			for(int i = 0; i < list.size(); i++) {
				 bw.write(list.get(i) +"");
			}
			bw.write("\n");
			bw.flush();
		}
	}

}
