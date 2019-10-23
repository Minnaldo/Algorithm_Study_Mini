package Computation_Thinking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 마방진 {

	static int N;
	static int[][] arr;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		int x = 0;
		int y = N/2;

		int cnt = 1;
		arr[x][y] = cnt;

		while(true) {
			if(cnt == N*N)
				break;

			int loc_x = x;
			int loc_y = y;

			loc_x--;
			loc_y++;

			if(loc_x < 0)
				loc_x = N-1;
			if(loc_y > N-1)
				loc_y = 0;
			if(loc_x > N-1)
				loc_x = 0;

			//대각선 오른쪽 위
			if(arr[loc_x][loc_y] > 0) {

				cnt++;
				x++;
				if(x > N-1)
					x = 0;
				arr[x][y] = cnt;

			}
			else {
				x = loc_x;
				y = loc_y;

				cnt++;
				arr[x][y] = cnt;
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}

		boolean check = mabangjin_check(arr, (N*N*N + N)/2);

		if(check)
			bw.write("마방진 체크 해봤는데, 마방진 True에요!!! \n");
		else
			bw.write("마방진 체크 해봤는데, 마방진 False다!!! \n");

		bw.flush();
	}



	static boolean mabangjin_check(int[][] arr, int mabangjin_sum) {
		int sum_garo = 0;
		int sum_sero = 0;
		int sum_left_cross = 0;
		int sum_right_cross = 0;

		boolean flag = false;

		//가로, 세로 마방진이냐?		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sum_garo += arr[i][j];
				sum_sero += arr[j][i];
			}

			if(sum_garo == mabangjin_sum && sum_sero == mabangjin_sum) {
				flag = true;
			}
			else {
				flag = false;
				return flag;
			}

			sum_garo = 0;
			sum_sero = 0;
		}

		//왼쪽위에서 오른쪽아래로 대각선 마방진이냐?
		for(int i = 0; i < N; i++) {
			sum_left_cross += arr[i][i];
		}

		int idx = N-1;
		//오른쪽위에서 왼쪽 아래로 대각선 마방진이냐?
		for(int i = 0; i < N; i++) {
			sum_right_cross += arr[i][idx];
			idx--;
		}

		if(sum_left_cross == mabangjin_sum && sum_right_cross == mabangjin_sum) {
			flag = true;
		}
		else {
			flag = false;
			return flag;
		}

		return flag;
	}

}
