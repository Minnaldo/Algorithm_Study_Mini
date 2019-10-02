import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class N과M_7 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		int[] result = new int[M];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		re_perm(arr, 0, result);
	}
	
	static void re_perm(int[] arr, int c, int[] result) throws IOException {
		if(c == result.length) {
			for(int i = 0; i < result.length; i++) {
				bw.write(result[i] + " ");
			}
			bw.write("\n");
			bw.flush();
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			result[c] = arr[i];
			re_perm(arr, c+1, result);
		}
	}

}
