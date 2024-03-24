package P02_Stringss;

public class String4 {
	public static void main(String[] args) {
		
		//Check No Of Words In A String.
		String s1 ="This will compare the entire strings, and in this example";		
		String[] s2 = s1.split("\\s");	
		System.out.println(s2.length);
		
		//Index
		String s3 =" Hiis there is an apple, But where is knife";		
		System.out.println(s3.indexOf("is"));
		System.out.println(s3.indexOf("is", 11));//Search For word "is" Starts from 11th Index		
	
		//LastIndexOf
		System.out.println(s3.lastIndexOf("is"));
		
		
}}
