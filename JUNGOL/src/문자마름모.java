import java.util.Scanner;

public class 문자마름모 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int x = 0, y = num1;
		char ch = 'A';
		
		char[][] ch_Arr = new char[num1*2-1][num1*2-1];
		
		for(int i = 0; i < num1*2-1; i++) {
			for(int j = 0; j < num1*2-1; j++) {
				
			}
		}
		
		
		for(int i = 0; i < num1*2-1; i++) {
			for(int j = 0; j < num1*2-1; j++) {
				System.out.print(ch_Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
