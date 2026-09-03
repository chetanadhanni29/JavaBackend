package Day8_23_03_2026;

public class UserDiscount {
	public static void main(String args[]) {
		String itemVal = args[0];
		// String minVal = args[1];
		String userType = args[1];
		System.out.println(userType);

		int itemValue = Integer.parseInt(itemVal);
		// int minValue = Integer.parseInt(minVal);

		int minValue = 1000;

		if ((itemValue >= minValue) || (userType.equals("Gold"))) {
			System.out.println("Eligible for 10% Discount");
		} else {
			System.out.println("Not Eligible for 10% Discount");
		}
	}
}
