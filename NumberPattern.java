//Write a program to print the following pattern using for loop:
//00 01 02 03 04 05 06 07 08 09 
//10 11 12 13 14 15 16 17 18 19 
//20 21 22 23 24 25 26 27 28 29 
//30 31 32 33 34 35 36 37 38 39 

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */
public class NumberPattern {

	public static void main(String[] args) {

		// This line will print the Row Number.
		for (int i = 0; i <= 3; i++) {

			// This line will print the column no from 0 to 9.
			for (int j = 0; j <= 9; j++) {
				System.out.print(+i + "" + j + " ");
				if (j == 9) {

					// when j=9 after the iteration on that time the column will terminate and jump
					// in to the another new line.
					System.out.println();

				}
			}
		}

	}

}
