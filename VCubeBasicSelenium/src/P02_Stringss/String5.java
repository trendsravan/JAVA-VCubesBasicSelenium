package P02_Stringss;

public class String5 {
	public static void main (String[] args) {
		
		//Join %% => "Jonny %% Jonny %% Yes %% Papa %%";
		
		//String s1 = "Jonny Jonny Yes Papa Eating Sugar No Papa";
		
		String s1 = String.join("||", "Jonny", "Jonny");
		System.out.println(s1);
	
		
		String s2 ="12345";
		int i = Integer.parseInt(s2);
		System.out.println(i*10);
		
		
	}

}
