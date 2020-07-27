//Write a Java program to create a new array list, add some colors (string) and print out the collection.

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

import java.util.ArrayList;

public class ColorsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList color = new ArrayList();
		color.add("Green");
		color.add("Red");
		color.add("Yellow");
		color.add("Velvet");
		color.add("Magenta");
		color.add("Back");
		color.add("White");
		color.add("Brown");
		// System.out.println(color.size());
		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}

	}

}
