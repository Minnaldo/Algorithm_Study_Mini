import java.util.Scanner;

public class 달팽이사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int rotate = num1;
		int[][] arr = new int[num1][num1];
		
		int cnt = 1;
		for(int i = 0; i < num1; i++) {
			arr[0][i] = cnt++;
		}
		int x = 0, y = num1-1;
		while(true) {
			if (rotate < 0) {
				for(int i = 0; i < num1; i++) {
					for(int j = 0; j < num1; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
			
			rotate--;
			//아래방향으로 이동,, 오른쪽 이동보다 -1
			for(int i = 0; i < rotate; i++) {
				//아래방향
				x++;
				arr[x][y] = cnt++;
			}

			
			//왼쪽방향으로 이동,,
			for(int i = 0; i < rotate; i++) {
				//왼쪽방향
				y--;
				arr[x][y] = cnt++;
			}
			
			rotate--;
			//위쪽으로 이동,,  아래&왼쪽보다 -1
			for(int i = 0; i < rotate; i++) {
				//위쪽방향
				x--;
				arr[x][y] = cnt++;
			}
			
			
			//오른쪽 방향,,   아래&왼쪽보다 -1
			for(int i = 0; i < rotate; i++) {
				//오른쪽방향
				y++;
				arr[x][y] = cnt++;
			}

		}
	}

}
