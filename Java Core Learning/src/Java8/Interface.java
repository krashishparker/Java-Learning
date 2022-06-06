package Java8;

//In JAVA 8 we can define a method inside Interface by using default keyword
interface I{
	void show();
	default void show1() {
		System.out.println("Inside I");
		
	}
}

interface J{
	void show();	
}
class C extends A implements I,J{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside Child class C..");
	} 
	
	
	
}
class A{
	public void show() {
		System.out.println("Inside A");
	}
}


public class Interface {
  public static void main(String[] args) {
	I c= new C();
	c.show1();
	c.show();
}
}
