//Write a program in Java to print "Hello World" ten times using do-while loop.

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class HelloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		int i=1;
		do {
			// i is used here to know that how many times our program is printing "Hello
			// World".
			System.out.println("Hello World" + " " + i);
			i++;
		}while(i<=10);

	}

}
