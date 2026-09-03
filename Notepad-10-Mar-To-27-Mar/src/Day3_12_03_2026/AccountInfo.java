package Day3_12_03_2026;

class AccountDetails {
	public static void main() {
		String accname = "Canara Bank";
		int accnum = 123456789;
		String ifsc = "CNRB0000";
		String branch = "BTM";
		System.out.println("Printing Account details from AccountDetails Class!!!");
		System.out.println(accname);
		System.out.println(accnum);
		System.out.println(ifsc);
		System.out.println(branch);
	}
}

class AccountBank {
	public static void main(String bank, String branch) {
		String b = bank;
		String br = branch;
		System.out.println(b + " " + br);
	}
}

public class AccountInfo {
	public static void main(String args[]) {

		System.out.println("Printing Account Information!!!");
		AccountDetails.main();
		AccountBank.main("SBI Bank", "BTM");

	}
}