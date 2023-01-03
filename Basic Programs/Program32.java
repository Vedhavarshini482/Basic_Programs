import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (number > 0)
			System.out.println(number + " is a Positive number");
		else
			System.out.println(number + " is a Negative number");
	}
}