import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 지그재그숫자 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int i = 1; i <= N; i++) {
				if(i % 2 == 1)
					sum += i;
				else
					sum += -(i);
			}
			
			bw.write("#"+tc+" "+sum+"\n");
			bw.flush();
		}
		
	}

}
