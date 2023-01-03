import java.util.Scanner;

public class Program51B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		String string = "" + number;
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--)
			reverse += string.charAt(i);
		int numberReverse = Integer.parseInt(reverse);
		System.out.println("The number in reverse order " + numberReverse);
	}
}