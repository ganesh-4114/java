package ramesh;

public class WelcomeSpinebiz {
	public static void main(String[] args) {
		int start = 1, table_num = 5;
		while(start <= 10) {
			System.out.println(table_num + "x" + start + "=" + table_num*start);
			start++;
		}
		System.out.println();
		
		do {
			System.out.println(table_num + "x" + start + "=" + table_num*start);
		}
		while (table_num > 6);
		System.out.println();
		
		for (int k = 1; k <= 9; k++) {
			System.out.println(5 + "x" + k + "=" + 5*k);
		}
}
}

