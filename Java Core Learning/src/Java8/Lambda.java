package Java8;
//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



//We can use Lambda function whenever we have to implement the method of a Interface
//Interface must have only one function to implement (Functional Interface)
//we basically not using a class to implement the interface and save coding
//think like declaring constructor of interface in along with the object call

interface Test{
	//void show();
	void show(int i);
	
	/*default void hello() {
		
	}*/
}

/*class Child implements Test{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show Test implementd");
	}
	
}*/
public class Lambda {
public static void main(String[] args) {
	Test t;
/*	t= new Test(){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("Test Interface's method is declared using Anonymous Class");
		}
	
	};*/
	
	
//	t= ()->System.out.println("Test Interface's method using Lambda"); no-parameter
	
	
//t= (i)->System.out.println("Lamdba Function with Paramter"); 
//avoid brackets is only one parameter
	
	t= i->System.out.println("Lamdba Function with Paramter"+ i);
	
	t.show(99);
}
}
