package IM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Magnetic {

	static int T;
	static int N;
	static int[][] arr;
	static int cnt;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			cnt = 0;
			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[j][i] == 1) {			//1일때,,  아래로 내려가면서 검사하며,
						for(int k = j+1; k < N; k++) {
							if(arr[k][i] == 1) {
								j = k;
							}
							
							else if(arr[k][i] == 2) {
								cnt++;
								arr[k][i] = 7;
								break;
							}
						}
					}
				}
			}
			
			bw.write("#" + tc + " " + cnt + "\n");
			bw.flush();
		}

	}

}
