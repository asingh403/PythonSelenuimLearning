//Question 4: Create a String array named as country which is having 10 different countries as a string value. Print the capital city of each country using for loop and if condition.
//Example: if <country name is India>
//then : print--> India's capital is New Delhi

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country[] = new String[5];
		country[0] = "India";
		country[1] = "england";
		country[2] = "usa";
		country[3] = "The Capital City is New Delhi";
		country[4] = "The Capital City is London";

		if (country[0].equals("India")) {
			System.out.println(country[3]);
		} else if (country[1].equals("england")) {
			System.out.println(country[4]);
		} else {
			System.out.println("Country and Capital City didn't match");
		}

	}

}
