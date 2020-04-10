package Projects;

public class Moverloading {
	int a;  //local parameter/variable
	int b;
	
	public void sum() {
		 a =10; 
		 b=20;
		 System.out.println(a+b);
	}
	public void sum(int x, int y) { // x and y are external parameter
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	public void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	
	
	
	
public static void main(String[] args) {
	Moverloading moo =new Moverloading();
	moo. sum();
	moo. sum(20,30);
	moo.sum(20,30,40);
	moo.sum(20,50.4);
	
}
}

