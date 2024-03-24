package P01_Collectionss;
import java.util.ArrayList;


public class ArrayList1 {

	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		a.add(1234);	//0
		a.add("$");		//1
		a.add("abcd");	//2
		a.add('a');		//3
		a.add("$");		//4
		a.add(false);	//5
		a.add(true);	//6
		a.add(12346.8f);//7
		a.add(8);		//8
		
		System.out.println(a);
		
		System.out.println(a.get(0)); 	//Getting values based on Index.
		
		a.remove("abcd");				//Removing based on object.
		a.remove(Integer.valueOf(1234));//[For removing integer we need to use Integer.valueOf else it consider it as index]
		System.out.println(a);
		a.remove(5);					//Remove Based on Index.

		a.clear();						//To clear all the elements in an array.
		System.out.println(a);
		
		System.out.println(a.isEmpty());// Checks any Element's present in an ArrayList or not.
		a.add("something");
		System.out.println(a.isEmpty());
		
		
		

}}
