package Day11_26_03_2026;

public class CreditScore {

	public static void main(String args[]) {
		CreditScore cs = new CreditScore();
		String sco = args[0];
		int scr = Integer.parseInt(sco);
		cs.scoreCheck(scr);
	}

	public void scoreCheck(int score) {
		if (score > 750) {
			System.out.println("Excellent Score");
		} else if (score >= 650 && score <= 750) {
			System.out.println("Good Score");
		} else {
			System.out.println("Not eligible need to improve cibil score");
		}
	}
}
