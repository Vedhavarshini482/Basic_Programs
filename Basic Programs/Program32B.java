import java.util.Scanner;

public class Program32B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println(number > 0 ? (number + " is a Positive number")
				: (number + " is a Negative number"));
	}
}