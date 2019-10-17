import java.util.ArrayList;
import java.util.Scanner;

public class 경비원_장인호 {//경비원
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int R = sc.nextInt();
		
		int N = sc.nextInt();
		ArrayList<Integer>[] position = new ArrayList[5];
		for (int i = 1; i < position.length; i++) {
			position[i] = new ArrayList<Integer>();
		}
		
		int m_d = 0;
		int m_p = 0;
		for (int i = 0; i < N+1; i++) {
			int d = sc.nextInt();//북, 남, 서, 동의 값
			int p = sc.nextInt();//각 방위에서 위치한 자리, 값
			if(i == N) {//
				m_d = d;
				m_p = p;
			}
			position[d].add(p);
		}
		
		//1 = 북, 2 = 남, 3 = 서, 4 = 동
		int sum = 0;
		for (int i = 1; i < position.length; i++) {
			
			if(m_d == i) {//같은 방향(북, 남, 서, 동)에 있을 때
				for (int v : position[i]) {
					sum += Math.abs(v - m_p);
				}
			}else {//같지 않을 때
				if(m_d == 1 || m_d == 2) {//북 또는 남 일때,
					if(i == 1 || i == 2) {//방향이 같지 않으므로 반대편에 있음
						for (int v : position[i]) {
							sum += R;
							sum += Math.min((m_p + v), (2*C - (v + m_p)));
						}
					}else {
						if(i == 3) {//서쪽일때
							for (int v : position[i]) {
								if(m_d == 1) {//북
									sum += (m_p + v);
								}else {//남
									sum += (m_p + R - v);
								}
							}
						}else {//동쪽일때
							for (int v : position[i]) {
								if(m_d == 1) {//북
									sum += (C - m_p + v);
								}else {//남
									sum += (C - m_p + R - v);
								}
							}
						}
					}
				}else if(m_d == 3 || m_d == 4) {//서 또는 동 일때,
					if(i == 3 || i == 4) {
						for (int v : position[i]) {
							sum += C;
							sum += Math.min((m_p + v), ((R - m_p) + (R - v)));
						}
					}else {
						if(i == 1) {//북일때
							for (int v : position[i]) {
								if(m_d == 3) {//서
									sum += (m_p + v);
								}else {//동
									sum += (m_p + C - v);
								}
							}
						}else {//남일때
							for (int v : position[i]) {
								if(m_d == 4) {//동
									sum += (R - m_p + C - v);
								}else {//서
									sum += (R - m_p + v);
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(sum);
	}
}