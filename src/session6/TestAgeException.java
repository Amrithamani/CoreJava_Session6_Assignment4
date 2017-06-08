package session6;

import java.util.Scanner;

public class TestAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating Scanner object

		Scanner s = new Scanner(System.in);

		// initialize age variable to get Integer value from user

		int age = s.nextInt();

		s.close();// closing Scanner object

		// checking if age is less than zero
		if (age < 0) {

			// using User defined Exception

			try {

				// using throw keyword

				throw new NegativeAgeException("Enter age  greater than zero");
			}

			catch (NegativeAgeException e) {

				System.out.println(e);
				// prints session6.NegativeAgeException: Enter age greater than
				// zero

			}
		} else {
			System.out.println("Age is: " + age);
			// prints age
		}

	}

}
