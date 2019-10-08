import java.util.Scanner;

public class 문자사각형2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[][] arr = new char[N][N];

		char ch = 'A';

		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < N; j++) {
					arr[j][i] = ch;
					if(ch > 89)
						ch = 'A';
					else
						ch++;
				}
			}
			else
				for(int j = N-1; j >= 0; j--) {
					arr[j][i] = ch;
					if(ch > 89)
						ch = 'A';
					else
						ch++;
				}
		}


		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
