import java.util.Scanner;

public class 부분수열의합_D4_Hong {

	static int K;
	static int N;
	static int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			for(int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			
			ans = 0;
			sum(0, 0);
			System.out.println("#" + tc + " " + ans);
		}
	}
	
	static int ans;
	private static void sum(int idx, int sum) {
		//기저파트... sum값이 K가 되거나, idx가 배열의 크기 만큼 왔거나.
		//sum이 K가 될때는 정답 값을 하나 증가
		if( sum == K ) {
			ans++;
			return; 
		}
		//idx가 끝까지 간건 그냥 종료
		if( idx == N )
			return;
		//idx는 증가 sum에 idx번째 더해서 재귀 호출
		sum(idx+1, sum + arr[idx]);
		//idx는 증가 sum은 그대로 재귀 호출
		sum(idx+1, sum);
		
	}

}
