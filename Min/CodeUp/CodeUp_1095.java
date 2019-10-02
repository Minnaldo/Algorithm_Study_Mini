package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
			
		}

		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= N; i++) {
			min = Math.min(arr[i], min);
		}
		
		System.out.println(min);
	}
}