//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered.
/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class MultipleOfSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			if (i % 7 == 0) {
				System.out.println("FOUND THE MULTIPLE OF 7,I AM BREAKING THE PROGRAM");
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
