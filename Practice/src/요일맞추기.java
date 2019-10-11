import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 요일맞추기 {

	static int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	//1월1일 금요일
	//0:월 , 1:화, 2:수, 3:목, 4:금, 5:토, 6:일
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			for(int i = 1; i < m; i++) {
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					sum += 31;
				}
				
				else if(i == 2)
					sum += 29;
				else
					sum += 30;
			}
			
			sum += d;
			sum += 3;
			
			bw.write("#"+tc+" "+sum%7+"\n");
			bw.flush();
		}
		
	}

}
