package IM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 비밀번호_SWEA_1234 {

	static int T;
	static int N;
	static char[] arr;
	static int[] brr;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		T = 10;
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			arr = new char[str.length()];
			brr = new int[str.length()];

			st = new StringTokenizer(br.readLine());
			for(int tt = 0; tt < str.length(); tt++) {
				arr[tt] = str.charAt(tt);
				//brr[tt] = (int)str.charAt(tt);
			}

			int idx = 0;
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > 47) {
					if(arr[i-idx] > 0 && arr[i+1 +idx] < arr.length) {

						if(arr[i-idx] == arr[i+1 +idx]) {
							arr[i-idx] = 0;
							arr[i+1 +idx] = 0;
							idx++;
//							i = i-idx;
						}

					}
				}
			}
			
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > 48) {
					if(arr[i] > 0 && arr[i+1 ] < arr.length) {
						if(arr[i] == arr[i+1]) {
							arr[i] = 0;
							arr[i+1] = 0;
							
						}
					}
				}
			}



			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > 48)
					bw.write(arr[i] + "");
			}
			bw.write("\n");

			bw.flush();
		}
	}

}
