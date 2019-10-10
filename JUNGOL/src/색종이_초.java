import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 색종이_초 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = sc.nextInt();

		int[][] arr = new int[100][100];
		
		for(int tc = 0; tc < T; tc++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			for(int i = num1; i < num1+10; i++) {
				for(int j = num2; j < num2+10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				result += arr[i][j];
			}
		}
		
//		System.out.println(result);
		bw.write(result + "");
		bw.flush();
	}

}
