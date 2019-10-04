import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N과M_9 {

	static int N, M;
	static int[] arr;
	static boolean[] visited;
	static HashSet<String> set = new HashSet<>();
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		perm(0, "");
		
		for(String str : set) {
			sb.append(str.substring(0, str.length()-1 ) + "\n");
		}
		System.out.print(sb.toString());
	}

	private static void perm(int cnt, String str) {
		if(cnt == M) {
			set.add(str);
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			perm(cnt+1, str+arr[i] + " ");
			visited[i] = false;
		}
		
	}
	
}