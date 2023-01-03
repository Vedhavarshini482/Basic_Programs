import java.util.Scanner;

public class Program2B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a capital letter");
		char character = scanner.next().charAt(0);
		for (char ch = character; ch <= 'Z'; ch++)
			System.out.print(ch);
	}
}