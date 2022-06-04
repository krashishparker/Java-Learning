class A{
	final void method() {
	System.out.println("Final Method can not be overridden");	
	}
}
class B extends A{
	//void method() {}  Final method cannot be overridden
}

final class Pare{
	Pare(){
		System.out.println("Parent Constrc.");
	}
	static void show() {
	System.out.println("Static Methodinside Final class");
	}
}
//class child extends Parent{}
//Final class Parent cannot be inherited

public class FinalKeyword {

	public static void main(String[] args) {
		final int i=10;
		//i=i+1;  not allowed
		Pare p= new Pare();
	    Pare.show();
	}
	
}
