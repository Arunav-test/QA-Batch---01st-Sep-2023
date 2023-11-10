package setsConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		//duplicate values are not stored
		
		Set<String> color = new HashSet<String>();
		color.add("black");
		color.add("brown");
		color.add("red");
		color.add("yellow");
		color.add("green");
		color.add("black");
		//color.add("Red");
		System.out.println(color.size());
		
		//System.out.println(color.get(2));
		
		Iterator<String> it = color.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		System.out.println("*************");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
