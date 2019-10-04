import java.util.Scanner;

//순열,, 중복이 없고, 순서가 있는, 자기자신은 안 포함!
public class N과M_1 {

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
		
		perm(arr, 0, result, new boolean[N]);
	}
	
	static void perm(int[] arr, int c, int[] result, boolean[] visited) {
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

}
