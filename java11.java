import java.util.Scanner;

public class java11 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		int c = a+b;
		int d = a-b;
		int e = a*b;
		double f = a*1.0/b;
		int g = a%b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + c);
		System.out.println("a - b = " + d);
		System.out.println("a * b = " + e);
		System.out.println("a / b = " + f);
		System.out.println("a % b = " + g);
	}
}