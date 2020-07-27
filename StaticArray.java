//Question 2: Write a program to create a static Array, having following cricket data:
//name, age, team name, DOB, gender, Strike Rate
//Try to create multiple Object Arrays for different players 
//Try to print all the values of each player on the console

/**
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Players name Declaration of the players.
		String[] name = new String[3];
		name[0] = "Virat   Kohali  ";
		name[1] = "Shikar  Dhawan  ";
		name[2] = "Ajinkya Rahane  ";

		// Team name Declaration of the players.
		String[] team_name = new String[3];
		team_name[0] = "RCB ";
		team_name[1] = "MI  ";
		team_name[2] = "KKR ";

		// Date of Birth Declaration of the players.
		String[] DOB = new String[3];
		DOB[0] = "1985-Mar-15 ";
		DOB[1] = "1987-Apr-20 ";
		DOB[2] = "1989-May-06 ";

		// Gender name declaration.
		String[] gender = new String[1];
		gender[0] = "Male ";

		// Strike Rate(SR) declaration.
		double[] sr = new double[3];
		sr[0] = 125.52;
		sr[1] = 100.25;
		sr[2] = 130.25;

		for (int i = 0; i < name.length; i++) {

			for (int j = 0; j < team_name.length; j++) {

				for (int k = 0; k < DOB.length; k++) {

					for (int m = 0; m < sr.length; m++) 

						 System.out.println(name[i] + " " + team_name[j] + " " + DOB[k]
						 + " " + gender[0] + " " + sr[m]);

					}
				}
			}
		}
	}
