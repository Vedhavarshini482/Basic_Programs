import java.util.Scanner;

public class Program34B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Positive number");
		int number = scanner.nextInt();
		int sum = 0, i = 1;
		while (i <= number) {
			sum += i;
			i++;
		}
		System.out.println("Sum of natural numbers until " + number + " is "
				+ sum);
		String string = Integer.toString(sum);
		int max = Integer.MIN_VALUE;
		for (i = 0; i < string.length(); i++)
			max = Math.max(max, string.charAt(i) - '0');
		System.out.println("Largest digit of the sum " + max);
	}
}