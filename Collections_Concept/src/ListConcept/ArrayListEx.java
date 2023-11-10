package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("Steve");//0
		al.add("Joe");//1
		al.add("Ram");//3
		
		System.out.println(al.size());
		al.add("bob");//4
		al.add("bruce");//5
		System.out.println(al.size());
		
		
		
		al.add(2, "Lee");
		al.remove(4);
		//al.clear();
		System.out.println(al.contains("bob"));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("**************");
		
		for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}
		
		
	}

}
