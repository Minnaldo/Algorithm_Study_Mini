import java.util.Scanner;

public class 수이어쓰기1 {

	static int N;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		int length = Integer.toString(N).length();
		int finish = (int) (N+1 - Math.pow(10, length-1));
		
		int sum = 0;
		for(int i = 1; i < length; i++) {
			sum += (Math.pow(10, i) - Math.pow(10, i-1)) * i;
		}
		
		sum += (finish) * length;
		
		System.out.println(sum);
		
	}

}
