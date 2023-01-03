import java.util.Scanner;

public class Program1B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter a number to generate Multiplication and subtraction table");
		int number = scanner.nextInt();
		System.out.println("Multiplication table for " + number);
		int i = 1;
		while (i <= 20)
			System.out.println(number + " * " + i + " = " + (number * i++));
		System.out.println("Subtraction table for " + number);
		i = 1;
		while (i <= 20)
			System.out.println(number + " - " + i + " = " + (number - i++));
	}
}