package P02_Stringss;

public class String2 {
	public static void main(String[] args) {
	
	//Compare and give the missing char count
	String s1 ="ABCDEFGK";		
	String s2 ="ABCDEFGH";	 	
	System.out.println(s1.compareTo(s2));	
	
	//Checks two String's are Equal or not
	String s3 ="ABCDEFG";		
	String s4 ="ABCDEFG";
	System.out.println(s3.equals(s4));
	
	//String Concatenation
	String s5 ="Hi";
	String s6 ="Sravan";
	String s7 ="Morning";	
	System.out.println(s5.concat(s7));
	String s8 = "I eat fruits " .concat(s7);
	System.out.println(s8);
	
	String s9 = s8.concat(" Very Healthy ").concat(s6);
	System.out.println(s9);
	
	//Check Empty or Not
	String s10 = "hi";
	String s11 = "";
	System.out.println(s10.isEmpty());
	System.out.println(s11.isEmpty());
	
}}
