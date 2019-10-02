package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp_1099 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[11][11];

		//input
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int i = 2, j = 2;
		while(true) {
			
			if(arr[i][j] == 0) {
				arr[i][j] = 9;
				
				if(arr[i][j+1]==0)
					j++;
				else
					i++;
			}
			
			if(arr[i][j] == 2) {
				arr[i][j] = 9;
				break;
			}
			
		}
		
		for(int k = 1; k <= 10; k++) {
			for(int l = 1; l <= 10; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}

	}
}