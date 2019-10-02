import java.util.Scanner;

public class N과M_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		int[] result = new int[M];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		re_combi(arr, 0, 0, result);
	}
	
	static void re_combi(int[] arr, int n, int c, int[] result) {
		if(c == result.length) {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = n; i < arr.length; i++) {
			result[c] = arr[i];
			re_combi(arr, i, c+1, result);
		}
	}
	
}
