package Day12_27_03_2026;

public class Message {
	public static void main(String args[]) {
		Message mesg = new Message();
		String n = args[0];
		int num = Integer.parseInt(n);
		mesg.printMessage(num);
	}

	public void printMessage(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(i + 1 + " : " + "Welcome to Kodewala and it is located in BTM!!!");
		}
	}
}
