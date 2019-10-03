package SWEA_D2;

import java.util.Scanner;

public class 날짜계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int[] num1 = new int[2];
			int[] num2 = new int[2];
			
			int result = 0;
			
			for(int i = 0; i < 2; i++) {
				num1[i] = sc.nextInt();
			}
			for(int i = 0; i < 2; i++) {
				num2[i] = sc.nextInt();
			}
			
			if(num1[0] == num2[0]) {					//같은 달이면
				result = num2[1] - num1[1] + 1;			//+1을 해줘야 하는 이유는 : ex) 31일-1일 = 30일이기 때문에,,
			}
			else {
				result = Day[num1[0]-1] - num1[1]+1;	//배열에 입력되어 있는 달에서 인덱스가 0번째부터이기 때문에, Day[num1[0]-1] << -1을 해줌.
				num1[0]++;
				while(num1[0] != num2[0]) {
					result += Day[num1[0]-1];
					num1[0]++;
				}
				result += num2[1];
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}

}
