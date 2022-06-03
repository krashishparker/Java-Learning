
class Parent{
	void show() {
		System.out.println("Inside Parent");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Inside Child");
	}
}
public class Overriding {
public static void main(String[] args) {
	Parent p= new Child();
	p.show();
}
}
//If we have a method of same name,signature and return type in child class/ 
//as in parent class then that method is said to be overridden by child class