import java.util.Scanner;

public class Program2A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a capital letter");
		char character = scanner.next().charAt(0);
		while (character <= 'Z')
			System.out.print(character++);
	}
}