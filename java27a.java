import java.util.Scanner;

public class java27a {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum = " + sum);
	}
}