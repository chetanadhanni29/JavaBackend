package Day6_17_03_2026;

public class DataType {
	static byte age;
	static short ifscCode;
	static int accountNum;
	static long numLong;
	static float balance;
	static double balanceDouble;
	static char gender;
	static boolean active;

	public static void main(String args[]) {
		age = 26;
		ifscCode = 12345;
		accountNum = 987654321;
		numLong = 98743256896434577l;

		balance = 10000.50f;
		balanceDouble = balance + 10000.90;

		gender = 'F';

		active = true;

		System.out.println("Customer age              :" + age);
		System.out.println("Bank IFSC Code            :" + ifscCode);
		System.out.println("Bank Account Number       :" + accountNum);
		System.out.println("Bank numLong              :" + numLong);
		System.out.println("Bank balance              :" + balance);
		System.out.println("Balance after transaction :" + balanceDouble);
		System.out.println("Customer gender           :" + gender);
		System.out.println("Account active?           :" + active);
	}
}