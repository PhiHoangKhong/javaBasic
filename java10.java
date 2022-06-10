import java.util.Scanner;

public class java10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		int b;
		System.out.println("a = ");
		a = sc.nextFloat();
		System.out.println("b = ");
		b = sc.nextInt();

		int c = (int) a;
		float d = (float) b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		int x = new Integer(32);
		System.out.println("x = " + x);
	}
}