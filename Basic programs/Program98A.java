import java.util.Scanner;

public class Program98A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char character = scanner.next().charAt(0);
		String string = "" + character;
		string = string.toUpperCase();
		System.out.println(string + " is an equivalent capital letter for "
				+ character);
	}
}