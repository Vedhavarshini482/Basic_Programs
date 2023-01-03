import java.util.Scanner;

public class Program57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string number in odd length");
		String string = scanner.next();
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if (i == j || j == string.length() - i - 1)
					System.out.print(string.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}