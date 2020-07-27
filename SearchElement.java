
//6. Write a Java program to search an element in a array list.

import java.util.ArrayList;

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */
public class SearchElement {
	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList();
		elements.add(1);
		elements.add(5);
		elements.add(9);
		elements.add(3);
		elements.add(7);
		elements.add(18);
		elements.add(13);
		boolean search = false;
		int i;
		for (i = 0; i < elements.size(); i++) {
			if (elements.get(i) == 20) {
				search = true;
				break;
			}
		}
		if (search)
			System.out.println(elements.get(i) + " is present at " + i + "th Index");
		else
			System.out.println("Element not found");
	}
}
