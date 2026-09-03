package Day6_17_03_2026;

public class PaymentInfo {
	static int accountNum;
	static int balance;
	static String bankName;
	static int accountCreateYear;

	public static void main(String args[]) {
		accountNum = 123456789;
		balance = 10000;
		balance += 500;
		bankName = "SBI";
		accountCreateYear = 2026;
		System.out.println("Account Number       :" + accountNum);
		System.out.println("Balance              :" + balance);
		System.out.println("Bank Name            :" + bankName);
		System.out.println("Account Created Year :" + accountCreateYear);
	}
}