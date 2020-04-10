package Projects;

public class MyClass {
	
	//Return value implementation

	//static int myMethod(int x, int y) {
		//return x + y;}
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Accessed Denied");
		}			else {
				System.out.println("Accessed Graunted");
			
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(myMethod(3, 6));
		
		checkAge(20);
		
	}
}
		
	//static void myMethod(String fname, int age) {
		
		//System.out.println(fname + " is " + age);
		
	//}
					//fname is parameter

	 	//static void myMethod(String fname) {
		//System.out.println(fname + " Joshi");
	 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
					//are arguments//all the name given below(....) 
		//myMethod("Dipika");
		//myMethod("Keshab");
		//myMethod("Dikesh");
		//myMethod("Oshin");
		//above is the example of method with single paramete
//Note that when you are working with multiple parameters,the method call must 
//have the same number of arguments as there are parameters, and the 
//arguments mustbe passed in the same order.


//public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	//all the name given on th(....) are arguments
	
	//myMethod("Dipika", 30);
	//myMethod("Keshab", 35);
	//myMethod("Dikesh", 3);
	//myMethod("Oshin", 1);
	
	
	
	
	
	
	
	
	


