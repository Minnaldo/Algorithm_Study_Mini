import java.util.Arrays;
import java.util.Scanner;

public class 스타일리쉬들여쓰기_3378 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int p = sc.nextInt();//마스터의 문장 라인 수
			int q = sc.nextInt();//스타일리쉬의 문장 라인 수
			String[] master = new String[p];
			String[] me = new String[q];
			for(int i = 0; i < p; i++)
				master[i] = sc.next();
			for(int i = 0; i < q; i++)
				me[i] = sc.next();
			int[] result = new int[q];
			Arrays.fill(result, -2);
			for(int r = 1; r <= 20; r++) {
				for(int c = 1; c <= 20; c++) {
					for(int s = 1; s<= 20; s++) {
						if( isOk(master, r, c, s)) {
//							그 r,c,s로 스타일리쉬의 각 라인별 들여쓰기를 계산.
							calIndent(me, r, c, s, result);
						}
					}
				}
			}
			System.out.print("#" + tc + " ");
			for(int indent : result) {
				System.out.print(indent + " ");
			}
			System.out.println();
		}
	}
	static void calIndent(String[] me, int r, int c, int s, int[] result) {
		int rCnt = 0, cCnt = 0, sCnt = 0;
		for(int i = 0; i < me.length; i++) {
			//i번째 라인에 대해서 아직 계산한 인덴트가 없다면 계산값 넣어주자
			if( result[i] == -2 )
				result[i] = r * rCnt + s * sCnt + c * cCnt;
			else {
				//처음이 아닌데 다른 경우의 들여쓰기 횟수가 계산되면 두가지 이상이므로 알수 없음.
				if( r * rCnt + s * sCnt + c * cCnt != result[i] )
					result[i] = -1;
			}
			//다음 라인의 들여쓰기를 검사하기 위해서 현재 라인에서의 괄호 유무를 체크
			for(char ch : me[i].toCharArray()) {
				switch(ch) {
				case '(': rCnt++; break;
				case ')': rCnt--; break;
				case '{': sCnt++; break;
				case '}': sCnt--; break;
				case '[': cCnt++; break;
				case ']': cCnt--; break;
				}
			}
		}
	}
	
	static boolean isOk(String[] master, int r, int c, int s) {
		//r * 소괄호 + c * 중괄호 + s * 대괄호
		int rCnt = 0, cCnt = 0, sCnt = 0;
		for(int i = 0; i < master.length; i++) {
			//해당 문장의 시작 들여쓰기 . 의 갯수가 몇개인지 세고
			//그 갯수가 지금까지 계산된 rCnt, sCnt, cCnt 와 매개로 받은 r,c,s를 통한 계산값과 일치하지 않으면 return false;
			int cnt = 0;
			//이 문장이 몇개의 . 으로 시작하는지 세보시오.
			for(char ch : master[i].toCharArray()) {
				if(ch == '.')
					cnt++;
				else
					break;
			}
			//해당 문장의 들여쓰기 수가 현재 rCnt, sCnt, cCnt, r,c,s에 의해 수식을 만족하지 않으면 return false;
			if( cnt != r * rCnt + s * sCnt + c * cCnt )
				return false;
			//다음 라인의 들여쓰기를 검사하기 위해서 현재 라인에서의 괄호 유무를 체크
			for(char ch : master[i].toCharArray()) {
				switch(ch) {
				case '(': rCnt++; break;
				case ')': rCnt--; break;
				case '{': sCnt++; break;
				case '}': sCnt--; break;
				case '[': cCnt++; break;
				case ']': cCnt--; break;
				}
			}
		}
		//모든 라인이 끝날때까지 return false안당했다면 멀쩡한거니까 return true;
		return true;
		
	}
}
