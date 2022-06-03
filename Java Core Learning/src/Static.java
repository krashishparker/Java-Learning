class Test{
	
/*	static int a=10,b;
	static{
		System.out.println("Static block running...");
		  b=6*a;
	}
*/	
}

public class Static {
	static int a=10,b;
	static{
		System.out.println("Static block running...");
		  b=6*a;
	}
	public static void main(String args[]) {
		System.out.println("Main running...");
		System.out.println("Value of b "+ b);
	}
}
//we declare Static Block when we want the static variable initialize in class;