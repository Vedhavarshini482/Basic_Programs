import java.util.Scanner;

public class Program25B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is "
				+ quotient);
		System.out.println("Remainder of " + num1 + " and " + num2 + " is "
				+ remainder);
	}
}