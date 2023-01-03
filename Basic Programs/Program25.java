import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();
		System.out.println("Quotient of " + num1 + " and " + num2 + " is "
				+ (num1 / num2));
		System.out.println("Remainder of " + num1 + " and " + num2 + " is "
				+ (num1 % num2));
	}
}