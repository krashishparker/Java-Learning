// How to call one constructor from another constructor.
class Cons
{
 Cons(){
	 this("Hello,");
	System.out.println("Mister ");
  }
  Cons(String s){
	 // this();
	  System.out.print("Ashish " +s);
  }
}
public class Constructor {

	public static void main(String args[]) {
		System.out.println("Main running...");
		Cons  c= new Cons();
	}
	
}
