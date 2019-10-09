import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long num1 = sc.nextInt();

		
		System.out.println(factorial(num1));
		
	}

	private static long factorial(long num1) {
		// TODO Auto-generated method stub
		if (num1 <= 1) {
			System.out.println(num1+"!"+" = "+num1);
			return num1;
		}
		else {
			System.out.println(num1+"!"+" = "+num1+" * "+(num1-1)+"!");
			return factorial(num1-1) * num1;
			
		}
	}

}
