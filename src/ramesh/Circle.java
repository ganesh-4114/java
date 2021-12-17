package ramesh;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int r;
          Scanner input = new Scanner(System.in);
          System.out.print("Please enter the radius: ");
          r = input.nextInt();
         float  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}
	


