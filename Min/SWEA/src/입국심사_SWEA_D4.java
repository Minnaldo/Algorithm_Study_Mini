import java.util.Scanner;

public class 입국심사_SWEA_D4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();//심사대 수 1 <= N <= 100000
			int M = sc.nextInt();//입국한 사람 수 <= 10^9
			int[] times = new int[N];
			int maxTime = 0;
			for(int i = 0; i < N; i++) {
				times[i] = sc.nextInt();
				maxTime = Math.max(maxTime, times[i]);
			}
			
			long left = 1;
			long right = (long)maxTime * M;
			while (left <= right) {
//				System.out.println(left + " " + right);
				
				long mid = (left + right) / 2;
				long sum = 0; //mid 시간 동안 처리되는 사람의 수
				for(int i = 0; i < times.length; i++) {
					sum += (mid / times[i]);
				}
				
				//내가 처리해야되는 애들보다 많으면
				if( sum >= M ) {
					//왼쪽을 검사
					right = mid - 1;
				}
				else {
					//오른쪽을 검사
					left = mid + 1;
				}
			}
			System.out.println("#" + tc + " " + left);
		}
	}
}

