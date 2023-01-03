import java.util.Scanner;

public class Program16B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		System.out.println("Root1 = " + root1);
		System.out.println("Root2 = " + root2);
	}
}