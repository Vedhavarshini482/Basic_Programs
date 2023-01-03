import java.util.Scanner;

public class Program48 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j < 2 * i - 1; j++)
				System.out.print(" ");
			for (int j = i; j <= number; j++)
				System.out.print(j + " ");
			for (int j = number-1; j >=i; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}