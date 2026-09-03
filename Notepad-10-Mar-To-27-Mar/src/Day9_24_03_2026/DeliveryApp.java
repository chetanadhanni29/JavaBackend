package Day9_24_03_2026;

public class DeliveryApp {

	static double gst = 5.0;
	static double item1Price = 80;
	static double item2Price = 100;
	static double item3Price = 150;

	String login(String user, String pass) {
		if (user.equals("Gowthu") && pass.equals("qwerty")) {
			return "Login Successful!!!";
		}
		return "Login Unsuccessful, Try again!!!";
	}

	double addItem(double itemPrice) {

		double gstAmount = (itemPrice * gst) / 100;
		double totalPrice = itemPrice + gstAmount;
		return totalPrice;
	}

	double removeItem(double totalAdd, double itemPrice) {

		double gstAmount = (itemPrice * gst) / 100;
		double totalPriceRemoval = totalAdd - itemPrice - gstAmount;
		return totalPriceRemoval;
	}

	public static void main(String args[]) {
		DeliveryApp da = new DeliveryApp();

		String userId = args[0];
		String password = args[1];
		String loginMesg = da.login(userId, password);
		System.out.println(loginMesg);
		System.out.println();

		if (loginMesg.equals("Login Successful!!!")) {
			String item1 = "Rice";
			String item2 = "Wheat";
			String item3 = "Ragi";

			// ADDING OF ITEMS
			double addPrice1 = da.addItem(item1Price);
			System.out.println("Total amount in cart after adding Rice = " + addPrice1);
			double discount1 = addPrice1 - (addPrice1 * 0.25);
			System.out.println("Total amount after discount of 25% = " + discount1);
			System.out.println();

			double addPrice2 = da.addItem(item2Price) + addPrice1;
			System.out.println("Total amount in cart after adding Rice and Wheat = " + addPrice2);
			double discount2 = addPrice2 - (addPrice1 * 0.25);
			System.out.println("Total amount after discount of 25% = " + discount2);
			System.out.println();

			double addPrice3 = da.addItem(item3Price) + addPrice2 + addPrice1;
			System.out.println("Total amount in cart after adding Rice, Wheat and Ragi = " + addPrice3);
			double discount3 = addPrice3 - (addPrice1 * 0.25);
			System.out.println("Total amount after discount of 25% = " + discount3);
			System.out.println();
			System.out.println();

			// REMOVAL OF ITEMS
			double remPrice3 = da.removeItem(addPrice3, item3Price);
			System.out.println("Total amount in cart after removing Ragi from cart = " + remPrice3);
			double remDiscount1 = remPrice3 - (remPrice3 * 0.25);
			System.out.println("Total amount after discount of 25% = " + remDiscount1);
			System.out.println();

			double remPrice2 = da.removeItem(addPrice2, item2Price);
			System.out.println("Total amount in cart after removing Wheat from cart = " + remPrice2);
			double remDiscount2 = remPrice2 - (remPrice2 * 0.25);
			System.out.println("Total amount after discount of 25% = " + remDiscount2);
			System.out.println();

			double remPrice1 = da.removeItem(addPrice1, item1Price);
			System.out.println("Total amount in cart after removing Rice from cart = " + remPrice1);
			System.out.println();

		}

	}
}
