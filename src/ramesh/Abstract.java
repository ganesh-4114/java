package ramesh;

abstract class Bank{    
abstract int getRateOfInterest(); 
abstract void add(int a, int b);
public void sub(int a, int b) {
	int c = b - a;
	System.out.println(c);
}
}    
class SBI extends Bank{    
int getRateOfInterest(){return 7;}

@Override
public void add(int a, int b) {
	int c = a + b;
	System.out.println(c);
} 
}    
class PNB extends Bank{    
int getRateOfInterest(){return 8;}

@Override
public void add(int a, int b) {
	int d = a * b;
	System.out.println(d);
}    
}    
    
class Abstract{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");   
b.add(8, 8);
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");
b.add(9, 8);
b.sub(2, 1);
}} 




