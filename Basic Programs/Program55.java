import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be printed");
		int row = scanner.nextInt();
		for (int i = 1; i <= row; i++) {
			if (i == 1 || i == row) {
				for (int j = 1; j <= row; j++)
					System.out.print("*");
			} else
				System.out.print("*");
			System.out.println();
		}
	}
}