package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*why??  왜 그냥 long 타입 2개 받아서 더하면 안되는거지?? */

public class CodeUp_1039 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strstr = str.split(" ");
		long[] result = new long[2];
		
		for(int i = 0; i < strstr.length; i++) {
			result[i] = Long.parseLong(strstr[i]);
		}
		
		long sum = 0;
		for(int i = 0; i < result.length; i++) {
			sum += result[i];
		}
		
		System.out.println(sum);
		
	}

}
