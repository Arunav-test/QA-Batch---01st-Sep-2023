package MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		
		Map<String,Integer> stud= new HashMap<String,Integer>();
		stud.put("bob", 70);
		stud.put("mark", 90);
		stud.put("john", 50);
		stud.put("bob", 30);
		
		System.out.println(stud.get("john"));
		System.out.println(stud.containsKey("lee"));
		System.out.println(stud);
		
		
	}

}
