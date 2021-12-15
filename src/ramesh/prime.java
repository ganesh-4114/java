
package ramesh;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number- ");  
		int a = sc.nextInt();  
		int b = 0;
		for (int i=2;i < a;i++) {
			if (a % i == 0) {
				b = b + 1;
			}
		}
		if (b == 0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime");
		}
	}

}
