package IM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 건초더미_SWEA {

	static int T;
	static int N;
	static int S1;
	static int S2;

	static int[] arr;
	static int cnt;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			cnt = 0;
			for(int tt = 0; tt < N; tt++) {
				arr[tt] = Integer.parseInt(br.readLine());
			}			
			
			int sum = 0;
			int avg = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			avg = sum / N;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < avg) {
					cnt += avg - arr[i];
					arr[i] += avg - arr[i];
				}
				
				
			}
			bw.write("#" + tc + " " + cnt + "\n");
			bw.flush();
		}

	}

}
