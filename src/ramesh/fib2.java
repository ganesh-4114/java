package ramesh;

public class fib2 {
	public static void main(String[] args) {
		int n = 7;
		int first = 0, second = 1, third;
		for (int i = 2; i <= n; i++) {
			third = first + second;
			System.out.println(" " + third);
			first = second;
			second = third;
		}
	}

}
