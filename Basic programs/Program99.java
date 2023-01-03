import java.util.Scanner;

public class Program99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		String upperCase = "";
		for (int i = 0; i < string.length(); i++)
			upperCase += (char) ((int) string.charAt(i) - 32);

		System.out.print(upperCase);
	}
}