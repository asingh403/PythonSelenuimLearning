import java.util.ArrayList;

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList elements = new ArrayList();
		elements.add("BLACK");
		elements.add("VELVET");
		elements.add(40);
		elements.add("12.55");
		elements.add("PYTHON");
		System.out.println("Element @ 0th index in ArrayList is  :" + elements.get(0));
		System.out.println("Element @ Last index in ArrayList is :" + elements.get(4));
		// adding element 25 at 0th index.
		elements.add(0, 25);

		System.out.println("******************");
		System.out.println("0th index Element in ArrayList is after inserting the value  :" + elements.get(0));
		elements.add(4, "India");
		System.out.println("Last index Element in ArrayList is after inserting the value :" + elements.get(4));

//		Write a Java program to retrieve an element (at a specified index) from a given array list.
		// We want to retrieve the element from 3 index.
		System.out.println("*************************");
		System.out.println("retrieve an element (at a specified index) :"+elements.get(2));
		
		//Write a Java program to remove the third element from a array list. 
		elements.remove(2);
		System.out.println("###############################");
		System.out.println("retrieve an element (at a specified index) :"+elements.get(2));
		
		
	}

}
