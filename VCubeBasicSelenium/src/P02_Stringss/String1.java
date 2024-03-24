package P02_Stringss;

public class String1 {
	public static void main(String[] args) {
		
		String s1 = "India Is My Country";
		String s2 = "TREE";
		
		System.out.println(s1.length());
		
		//Print In Index Order.
		System.out.println(s1.charAt(0));
		
		//Print One By One.
		for (int i =0; i<=s1.length()-1; i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		
		//Print String in Reverse Order.
		for (int i=s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
		}
		
	

}}
