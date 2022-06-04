/*An abstract is a java modifier applicable for classes and methods
in java but not for Variables. 
1.) An instance of an abstract class can not be created.
2.)Constructors are allowed.
3.)We can have an abstract class without any abstract method.
4.)There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simper terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
5.)We can define static methods in an abstract class
If a class contains at least one abstract method then compulsory should declare a class as abstract 
If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method
Let us elaborate on these observations and do justify them with help of clean java programs as follows.

Observation 1: In Java, just likely in C++ an instance of an abstract class cannot be 
*/
abstract class Person{
	Person(){
		System.out.println("Inside Abstract Parent class Constructor");
		//2.)Constructors are allowed.
	}
	//3.)We can have an abstract class without any abstract method.
	static void show() {
		System.out.println("Non Abstract class");
		//5.)We can define static methods in an abstract class
	}
	abstract void method(); 
}
class Student extends Person{

	Student(){
	//super();
	System.out.println("Inside child class constructor..");
	}
	@Override
	void method() {
		
		System.out.println("Abstract method overriden");
	}
	
}
public class Abstract {
public static void main(String[] args) {
	System.out.println();
	//Person p = new Person(); 1.) cannot be instantiated
	//Person p= new Student();
	Student s= new Student();
	s.method();
	Student.show();
}
}
