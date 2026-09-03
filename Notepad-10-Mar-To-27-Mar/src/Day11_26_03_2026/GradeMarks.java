package Day11_26_03_2026;

public class GradeMarks {

	public static void main(String args[]) {
		GradeMarks cs = new GradeMarks();
		String marks = args[0];
		int grade = Integer.parseInt(marks);
		cs.scoreCheck(grade);
	}

	public void scoreCheck(int grade) {
		if (grade >= 75) {
			System.out.println("A Grade with Distinction");
		} else if (grade > 65 && grade < 75) {
			System.out.println("A Grade");
		} else if (grade > 45 && grade <= 65) {
			System.out.println("B Grade");
		} else if (grade > 36 && grade <= 45) {
			System.out.println("C Grade");
		} else {
			System.out.println("Failed Not eligible for promotion to next standard");
		}
	}
}
