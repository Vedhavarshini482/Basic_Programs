import java.util.Scanner;

public class Program3A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int duplicate = number;
		int reverse = 0;
		while (duplicate != 0) {
			int temp = duplicate % 10;
			reverse = (10 * reverse) + temp;
			duplicate = duplicate / 10;
		}
		System.out.println("Differece between " + number
				+ " and its reversed number " + reverse + " is\n"
				+ (number - reverse));
	}
}
