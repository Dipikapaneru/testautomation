package Projects;

public class Constructoroverloading {
	//below are class atribute
	int a=0;
	int b=0;
	double c=0;
	
	Constructoroverloading(){
		a=10;
		b=20;
		c=20.5;
	}
	
	Constructoroverloading(int x, int y){
		a=x;
		b=y;
	}
	
	Constructoroverloading(int x, double y){
		a=x;
		c=y;
	}
	Constructoroverloading(int x, int y, double z){
		a=x;
		b=y;
		c=z;
		}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructoroverloading coo=new Constructoroverloading();
		
		
		//Constructoroverloading coo=new Constructoroverloading(10, 20);
	
		
		
		//Constructoroverloading coo=new Constructoroverloading(10, 20, 20.5);
		
		
		Constructoroverloading coo=new Constructoroverloading(10, 20);
		coo.display();
		}
}		
		
	
//Note that the constructor name must match the class name, and 
//it cannot have a return type (like void).
//Also note that the constructor is called when the object is created.
//All classes have constructors by default: if you do not create a 
//class constructor yourself, Java creates one for you. However,
//then you are not able to set initial values for object attributes.

	//how to differ 
	//number, order or data type of parameter
	
	
	
//constructor is a special kind of method
//constructor  name same as class name
//method can return some value constructor do no
//constructor will be invoked at the time object creation ...
//(...we no need to call the constructor explicitly)
//constructor will take the parameter just like method
//constructor is used for initialize the value

//two types of constructor
//Default
//parameterized