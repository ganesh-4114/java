
package ramesh;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[][] = {{"ganesh","dandamudi","123"},{"sheshank","pendli","1234"},{"ramesh","polla","2583"}};
		for (int i=0;i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if(i-j == arr[i].length - 3) {
				System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
