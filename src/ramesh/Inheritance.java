package ramesh;

import java.util.Scanner;

class Inheritance1 {
	String name;
	private int id = 21548;
	void works(String name) {
		Scanner n = new Scanner(System.in);
		System.out.println(name + " works as a Software Engineer at Spinebiz");
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
	class Inheritance extends Inheritance1 {
		String role = "React Developer";
		public static void main(String[] args) {
		Inheritance1 obj = new Inheritance1();
		obj.works("Ganesh");
		System.out.println(obj.getId());
}
	}
	
	class Ganesh extends Inheritance {
		
	}
