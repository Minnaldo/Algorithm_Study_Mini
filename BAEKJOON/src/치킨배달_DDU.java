import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class 치킨배달_DDU {

	//0빈칸 2치킨집 1집
	//집과 가장 가까운 치킨집 사이의 거리 => 치킨거리
	//집이 기준이다. 각각의 집은 치킨 거리를 가진다. 
	//도시의 치킨거리는 모든 집의 치킨 거리의 합
	
	//치킨 집을 조합으로 M개 뽑아. => 치킨거리 계산해
	static int N;
	static int M;
	static ArrayList<Point> home;
	static ArrayList<Point> chicken;
	static int[][] map;
	static int result=Integer.MAX_VALUE;
	static int[] resultArr;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt(); //남길 치킨집 수
		
		home=new ArrayList<>();
		chicken=new ArrayList<>();
		int input=0;
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < N; j++) {
				input=sc.nextInt();
				if(input==1) {
					home.add(new Point(i,j));
				}else if(input==2) {
					chicken.add(new Point(i,j));
				}
			}
		}
		arr=new int[chicken.size()];
		for (int i = 0; i <arr.length; i++) {
			arr[i]=i;
		}
		resultArr=new int[M];
		
		map=new int[home.size()][chicken.size()];
		for (int i = 0; i < home.size(); i++) {
			for (int j = 0; j < chicken.size(); j++) {
				map[i][j]=Math.abs(home.get(i).x-chicken.get(j).x)+Math.abs(home.get(i).y-chicken.get(j).y);
			}
		}
		
		combi(0,0);
		System.out.println(result);
	}

	private static void combi(int n, int c) {
		// TODO Auto-generated method stub
		if(c==resultArr.length) {
			int alltmp=0;
			for (int i = 0; i < home.size(); i++) {
				int onetmp=Integer.MAX_VALUE;
				for (int j = 0; j <resultArr.length; j++) {
					//한 집에서 가장 가까운 치킨집 거리 저장
					onetmp=Math.min(onetmp, map[i][resultArr[j]]);
				}
				alltmp+=onetmp;
			}
			result=Math.min(result, alltmp);
			return;
		}
		if(n==arr.length) return;
		resultArr[c]=arr[n];
		combi(n+1,c+1);
		combi(n+1,c);
	}

}
