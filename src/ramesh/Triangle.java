package ramesh;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 10,h = 20;
		double area = 0.5*base*h ;
		double rect_area = base * h;
		System.out.println("Area of Triangle: " + area);
		System.out.println("Area of Rectangle: " + rect_area);
		
		if (base == h) {
			System.out.println("Square");
		} else {
			System.out.println("Rectangle");
		}
	}

}
