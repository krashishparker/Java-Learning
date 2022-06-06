package Java8;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Whenever we print values of List we usually do using 'for' loop which is external loop
External means we pick one value from list and then print one after another

In Java 8 we have something call Internal Loop ,which can be done using ForEach and save some time
   
*/
public class ForEach {
public static void main(String[] args) {
	
	List<Integer> list= Arrays.asList(1,4,6,4,7);
	
	//traditional
	System.out.println("Traditional ");
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+ " ");
	}
	
	System.out.println();
	//Enhanced for loop
	System.out.println("Enhanced For Loop ");
	for(int i:list) {
		System.out.print(i+" ");
	}
	System.out.println();
	//For Each
	System.out.println("For-Each Loop Java 8");
	
	list.forEach(i -> System.out.print(i+" "));//Lambda function 
	
}
}
