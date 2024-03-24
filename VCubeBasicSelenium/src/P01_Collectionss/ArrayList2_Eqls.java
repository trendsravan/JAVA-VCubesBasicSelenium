package P01_Collectionss;

import java.util.ArrayList;

public class ArrayList2_Eqls {
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
		b.add("abcd");	//2
		b.add('a');		//3
		b.add("$");		//4
		b.add(false);	//5
		b.add(true);	//6
		b.add(12346.8f);//7
		
		System.out.println(a.equals(b)); // Compare two Arrays.

		
		
	}

}
