import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter a number to find the factorial of that number");
		int number = scanner.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++)
			fact *= i;
		System.out.println("factorial of " + number + " is " + fact);
		String string = Integer.toString(fact);
		int sum = 0;
		for (int i = 0; i < string.length(); i++)
			sum += string.charAt(i) - '0';
		System.out.println("Sum of digits in the factorial number is " + sum);
	}
}