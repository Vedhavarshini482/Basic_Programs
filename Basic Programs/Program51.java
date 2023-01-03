import java.util.Scanner;

public class Program51 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int reverse = 0;
		while (number != 0) {
			int temp = number % 10;
			reverse = (reverse * 10) + temp;
			number = number / 10;
		}
		System.out.println("The number in reverse order " + reverse);
	}
}