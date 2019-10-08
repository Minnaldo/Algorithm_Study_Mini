import java.util.Scanner;
import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Stack<String> stack = new Stack<String>();

		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			char ch = sc.next().charAt(0);

			if(ch == 'i') {
				stack.add(sc.next());
			}
			else if(ch == 'c') {
				System.out.println(stack.size());
			}
			else if(ch == 'o') {
				if(stack.isEmpty())
					System.out.println("empty");
				else
					System.out.println(stack.pop());
			}
		}
	}
}