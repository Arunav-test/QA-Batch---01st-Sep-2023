package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class AL {

	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(23);
		al.add("John");
		al.add(45.63);
		
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));

	}

}
