
class Parent1{
	
	int a=10;
	
	Parent1(){
	 System.out.println("Inside Parent constructor ");
	}
	
	Parent1(String s){
		 System.out.println("Inside Parent constructor with parameter value:" + s);
		}
	void show() {
		System.out.println("Inside parent show method");
	}
		
}
class Child1 extends Parent1{
	Child1()
	{super();
	System.out.println("Inside Child class..");
	}
	//super keyword to get variables declared in parent class
	void show(){
		
		System.out.println("Inside child, calling parent variable a " +super.a);
		super.show();
	}
	//super keyword to call methods variables declared in parent class
	//
	
}


public class SuperKeyword{
public static void main(String[] args) {
	Parent1 p= new Child1();
	p.show();
}
}
