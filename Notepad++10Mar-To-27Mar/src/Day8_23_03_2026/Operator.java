package Day8_23_03_2026;

public class Operator {
	public static void main(String args[]) {
		String input = args[0];
		System.out.println("Input in String format " + input);
		int userAge = Integer.parseInt(input);

		// 1. Assignment operator, Local Variable
		int minAge = 18;
		System.out.println("Min Age to apply " + minAge);
		// 2. Equal operator
		System.out.println(minAge == userAge);
		// 3. Greater than equal to
		System.out.println(minAge <= userAge);
		// 4. Lesser than equal to
		System.out.println(minAge >= userAge);
		// 5. Not Equal to
		System.out.println(minAge != userAge);

	}
}
