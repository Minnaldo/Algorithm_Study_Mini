import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 영역구하기 {
	static int dr [] = {1,-1,0,0};
	static int dc [] = {0,0,1,-1};
	static int c;
	static int r;
	static int count=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r= sc.nextInt();
		c = sc.nextInt();
		ArrayList<Integer> result= new ArrayList<Integer>();
		int k = sc.nextInt();
		int map [][] = new int [r][c];
		
		int arr [][] = new int [k][4];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < k; i++) {
			for (int j = arr[i][1]; j < arr[i][3]; j++) {
				for (int l = arr[i][0]; l < arr[i][2]; l++) {
					map[j][l]=1;
				}
			}
		}
		/*for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}*/
		
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(map[i][j]==0) {
					dfs(i,j,map);
					result.add(count);
					count=0;
				}
			}
		}
		int last [] = new int [result.size()];
		for (int i = 0; i < last.length; i++) {
			last[i]= result.get(i);
		}
		Arrays.sort(last);
		
		if(result.size()==0) {
			System.out.println("0");
		}else {
			for (int i = 0; i < last.length; i++) {
				if(i==last.length-1) {
					System.out.print(last[i]);
				}else
					System.out.print(last[i] + " ");
			}
		}
	}
	static void dfs(int x, int y, int map[][]) {
		map[x][y]=1;
		count++;
		for (int i = 0; i < 4; i++) {
			int nr = dr[i]+x;
			int nc = dc[i]+y;
			if(nr>=0 && nr<r && nc>=0 && nc<c) {
				if(map[nr][nc]==0) {
					dfs(nr,nc,map);
				}
			}
		}
	}
}