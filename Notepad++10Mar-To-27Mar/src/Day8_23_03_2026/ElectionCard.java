package Day8_23_03_2026;

public class ElectionCard {
	public static void main(String args[]) {
		String min = args[0];
		String max = args[1];
		String user = args[2];
		int minAge = Integer.parseInt(min);
		int maxAge = Integer.parseInt(max);
		int userAge = Integer.parseInt(user);

		if ((userAge >= minAge) && (userAge <= maxAge)) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}

	}
}
