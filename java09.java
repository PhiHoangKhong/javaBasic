import java.util.Scanner;

public class java09 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		String name;
		name = sc.nextLine();
		System.out.println("mssv: ");
		int mssv = sc.nextInt();
		System.out.println("name: " + name);
		System.out.println("mssv: " + mssv);
	}
}