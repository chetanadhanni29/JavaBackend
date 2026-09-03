package Day9_24_03_2026;

public class Student {
	public static void main(String args[]) {
		// Student s = new Student();
		float percentage = Student.marksCard(90, 95, 89, 99, 97, 98);
		System.out.println("Student percentage : " + percentage);
	}

	static float marksCard(int m1, int m2, int m3, int m4, int m5, int m6) {
		float total = m1 + m2 + m3 + m4 + m5 + m6;
		float percent = total / 6;
		return percent;
	}
}
