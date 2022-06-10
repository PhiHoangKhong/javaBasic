import java.util.Scanner;

public class java27 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		try {
			System.out.println("n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("du lieu khong dung!");
		} finally {
			System.out.println("sai roi e ei!");
		}
		System.out.println("n: " + n);
		System.out.println("ket thuc chuong trinh!");
	}
}