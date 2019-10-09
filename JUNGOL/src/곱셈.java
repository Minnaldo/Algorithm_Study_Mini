import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int baek = num2 / 100 * 100;
		num2 = num2%100;
		int sip = num2 / 10 * 10; 
		num2 = num2%10;
		int il = num2;
		
		int three = il * num1;
		System.out.println(il * num1);
		int four = sip * num1;
		System.out.println(sip/10 * num1);
		int five = baek * num1;
		System.out.println(baek/100 * num1);
		
		System.out.println(three+four+five);
		
	}

}
