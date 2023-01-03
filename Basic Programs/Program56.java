import java.util.Scanner;

public class Program56 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int j = 1;
		for (int i = 1; j <= number; i++) {
			for (int k = 1; k <= (number / 2) - i; k++)
				System.out.print(" ");
			for (int k = 1; k <= i && j <= number; k++, j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}