import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		System.out.println("x = " + x + "\nx = x++ * 2 + 3 * --x is "
				+ (x = x++ * 2 + 3 * --x));
	}
}