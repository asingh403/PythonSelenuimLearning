//Try to print the following pattern on the console:
//n = 4
//n = 3
//n = 2
//n = 1
//n = 0

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 4; i++) {
			int n = 4 - i;
			System.out.print("n" + " = " + n);
			System.out.println();
		}
	}

}