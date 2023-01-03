import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a capital letter");
		char character = scanner.next().charAt(0);
		while (character >= 'A') {
			for (int i = character - 64; i >= 1; i--)
				System.out.print(character);
			character--;
			System.out.println();
		}
	}
}