import java.util.Arrays;
import java.util.Scanner;

public class 부분수열의합 {

	static int[] arr;
	static boolean[] visited;
	static int N;
	static int M;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			arr = new int[N];
			visited = new boolean[N];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			cnt = 0;
			
			powerSet(0);
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
	
	static int cnt = 0;
	static int sum = 0;
	private static void powerSet(int idx) {
		
		if(idx == arr.length) {
			sum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(visited[i] == true) {
					sum += arr[i];
				}
			
			}
			if(sum == M)
				cnt++;
//			System.out.println(Arrays.toString(visited) + "  sum = " + sum);
			return;
		}
		
		visited[idx] = true;
		powerSet(idx+1);
		visited[idx] = false;
		powerSet(idx+1);
		
	}

}
