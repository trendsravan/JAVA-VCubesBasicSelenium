package P01_Collectionss;
import java.util.ArrayList;

public class Rough1 {

	public static void main(String[] args) {
			
		ArrayList a = new ArrayList();
		a.add(1234);    // 0
		a.add("$");     // 1
		a.remove(Integer.valueOf(1234));  // Remove the element with value 1234
		System.out.println(a);

	}

}
