import java.util.Scanner;

public class Program1A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter a number to generate Multiplication and subtraction table");
		int number = scanner.nextInt();
		System.out.println("Multiplication table for " + number);
		for (int i = 1; i <= 20; i++)
			System.out.println(number + " * " + i + " = " + (number * i));
		System.out.println("Subtraction table for " + number);
		for (int i = 1; i <= 20; i++)
			System.out.println(number + " - " + i + " = " + (number - i));
	}
}