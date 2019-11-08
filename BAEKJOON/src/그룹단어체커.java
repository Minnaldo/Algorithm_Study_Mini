import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;

public class 그룹단어체커 {

	static int N;
	static int result;
	static int same_word;

	static char[] map;
	static int[] check;

	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		result = 0;
		for(int tc = 0; tc < N; tc++) {
			String str = br.readLine();
			map = new char[str.length()];
			check = new int[str.length()];
			same_word = 0;
			

			for(int i = 0; i < str.length(); i++) {
				map[i] = str.charAt(i);
			}

			for(int i = 0; i < map.length; i++) {
				for(int j = i+2; j < map.length; j++) {
					
					if(map[i] == map[j]) {
						if(map[i] == map[i+1])
							continue;
						same_word++;
					}
				}
			}

			if(same_word == 0)
				result++;
			
		}
		System.out.println(result);


	}
}
