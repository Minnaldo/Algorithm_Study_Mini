import java.util.Scanner;

public class 주사위던지기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = {1,2,3,4,5,6};
		int[] result = new int[M];
		
		if(K==1)
			re_perm(arr, 0, result);
		else if(K==2)
			re_combi(arr, 0, 0, result);
		else if(K==3)
//			combi(arr, 0, 0, result);
			perm(arr, 0, result, new boolean[6]);
	}
	
	

	private static void perm(int[] arr, int c, int[] result, boolean[] visited) {
		// TODO Auto-generated method stub
		if(c == result.length) {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(visited[i] == false) {
				result[c] = arr[i];
				visited[i] = true;
				perm(arr, c+1, result, visited);
				visited[i] = false;
			}
		}
		
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
		
		for(int i = 0; i < arr.length; i++) {
			result[c] = arr[i];
			re_combi(arr, n+1, c+1, result);
			re_combi(arr, n, c+1, result);
		}
		
	}

	private static void re_combi(int[] arr, int n, int c, int[] result) {
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
		
		for(int i = n; i < arr.length; i++) {
			result[c] = arr[i];
			re_combi(arr, i, c+1, result);
		}
	}

	private static void re_perm(int[] arr, int c, int[] result) {
		// TODO Auto-generated method stub
		
		if(c == result.length) {
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			result[c] = arr[i];
			re_perm(arr, c+1, result);
		}
	}
	
	

}
