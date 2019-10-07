import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 숫자사각형3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = sc.nextInt();
		
		int cnt = 1;
		int[][] arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[j][i] = cnt++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
//				System.out.print(arr[i][j] + " ");
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
			bw.flush();
		}
		
		
	}

}
