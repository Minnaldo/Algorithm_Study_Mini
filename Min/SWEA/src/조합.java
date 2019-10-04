import java.util.Scanner;

public class 조합 {

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
		
		combi(arr, 0, 0, result);
	}

	private static void combi(int[] arr, int n, int c, int[] result) {
		// TODO Auto-generated method stub
		if(c == result.length) {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		if(n == arr.length)
			return;
		
		result[c] = arr[n];
		combi(arr, n+1, c+1, result);
		combi(arr, n+1, c, result);
	}
	

}
