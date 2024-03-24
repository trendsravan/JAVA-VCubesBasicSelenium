package P01_Collectionss;

import java.util.ArrayList;

public class ArrayList3__AddColl {
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
		
		ArrayList b = new ArrayList();
		b.add(1234);	//0
		b.add("$");		//1
		 
			
		System.out.println(a);
		System.out.println(b);
		
		b.addAll(a);			//Add all the elements present in "a" to "b".
		System.out.println(b);
		
		System.out.println(a.contains(1234)); //Check the element present in the array or not.
		
		b.add(1, "JoinedMiddle");			//Adding Elements by specifying the index
		System.out.println(b);
		
		System.out.println(a.indexOf("$"));		//Checks the First Occurrence element-"$" & return Index No. 
		System.out.println(a.lastIndexOf("$"));	//Checks the Last Occurrence of "$" & return Index No.    
	
		System.out.println(a.get(0));    		//Returns the value present in that index Number.
}}
