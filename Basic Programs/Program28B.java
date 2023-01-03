import java.util.Scanner;

public class Program28B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println(number % 2 == 0 ? (number + "  is an Even Number")
				: (number + " is an Odd Number"));
	}
}