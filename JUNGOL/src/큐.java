import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Queue<String> queue = new LinkedList<String>();
		
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			char ch = sc.next().charAt(0);
			
			if(ch == 'i') {
				queue.offer(sc.next());
			}
			else if(ch == 'c') {
				System.out.println(queue.size());
			}
			else if(ch == 'o') {
				if(queue.isEmpty())
					System.out.println("empty");
				else
					System.out.println(queue.poll());
			}
		}
		
	}

}
