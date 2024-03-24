package P02_Stringss;

public class String3 {

	public static void main(String[] args) {
		
		//Contains Char Sequence search
		String s1 ="Jasmin";
		System.out.println(s1.contains("J"));
		
		//Starts & EndsWith with prefix value
		String s2 ="Hi Bro";
		String s3 ="Hi man";
		System.out.println(s2.startsWith("Hi"));
		System.out.println(s3.endsWith("Bro"));
		System.out.println(s2.startsWith(s3, 0)); //Check s2 in Sub-String of s3 of index 0
		
		//Replace words		
		String s4 ="Men will be Men";
		String s5 ="Baby Like Chocklets";
		System.out.println(s4.replace("Men", "Women"));
		
		//Repeat
		String s6 ="Hi-5 ";
		System.out.println(s6.repeat(5));
		
		

	

}}
