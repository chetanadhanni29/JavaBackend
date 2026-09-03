package Day4_13_03_2026;

public class Order {
	public static void main(String args[]) {
		String orderID = args[0];
		String itemName = args[1];
		String price = args[2];
		String qty = args[3];
		String state = args[4];
		String address = args[5];
		System.out.println("Order details of Amazon");
		System.out.println("Order ID   : " + orderID);
		System.out.println("Item Name  : " + itemName);
		System.out.println("Price      : " + price);
		System.out.println("Quantity   : " + qty);
		System.out.println("State      : " + state);
		System.out.println("Address    : " + address);
	}

}
