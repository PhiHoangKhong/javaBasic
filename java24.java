import java.util.Scanner;

public class java24 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		String nhiPhan = "";
		while(n!=0) {
			nhiPhan = n%2 + nhiPhan;
			n/=2;
		}
		System.out.println(m + " -> " + nhiPhan);
	}
}