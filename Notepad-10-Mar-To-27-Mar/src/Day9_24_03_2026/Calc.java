package Day9_24_03_2026;

public class Calc {
	public static void main() {
		Calc c = new Calc();
		int output = c.addNumber(12, 56);
		System.out.println("Sum is : " + output);
	}

	int addNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
