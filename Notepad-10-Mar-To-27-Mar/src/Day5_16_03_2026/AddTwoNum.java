package Day5_16_03_2026;

//class AddTwoNum {
//	public static void main(String args[]) {
//		System.out.println("Adding Two Number");
//		if (args.length == 2) {
//			int a = Integer.parseInt(args[0]);
//			int b = Integer.parseInt(args[1]);
//			System.out.println("Addition of Two number: " + (a + b));
//		} else {
//			System.out.println("Please provide two numbers to perform addition");
//		}
//	}
//}

public class AddTwoNum {
	public static void main(String args[]) {
		System.out.println("Adding Two Number");
		if (args.length != 2) {
			System.out.println("Please provide two numbers to perform addition");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition of Two number: " + (a + b));
	}
}