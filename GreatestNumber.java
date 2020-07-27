//Take three numbers from the user and print the greatest number.
/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 87;
		int b = 78;
		int c = 25;
		// = operator which taken to keep in the mind for below scenario:
		// int a=87,b = 87,c =25
		if (a >= b && a >= c) {
			// in that scenario as per the line number 16 then the program will
			// declare the first greatest number in the input to greatest number.
			System.out.println(a + " " + "=a which is the greatest number");
		} else {
			if (b >= a && b >= c) {
				System.out.println(b + " " + "= b which is the greatest number");
			} else {
				System.out.println(c + " " + "=c which is the greatest number");
			}
		}
	}
}
