import java.util.Scanner;

public class Program35B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter a number to find the factorial of that number");
		int number = scanner.nextInt();
		int fact = 1, i = 1;
		while (i <= number)
			fact *= i++;
		System.out.println("factorial of " + number + " is " + fact);
		String string = Integer.toString(fact);
		int sum = 0;
		i = 0;
		while (i < string.length())
			sum += string.charAt(i++) - '0';
		System.out.println("Sum of digits in the factorial number is " + sum);
	}
}