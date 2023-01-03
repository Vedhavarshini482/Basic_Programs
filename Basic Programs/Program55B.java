import java.util.Scanner;

public class Program55B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be printed");
		int row = scanner.nextInt();
		int i = 1;
		while (i <= row) {
			if (i == 1 || i == row) {
				int j = 1;
				while (j <= row) {
					System.out.print("*");
					j++;
				}
			} else
				System.out.print("*");
			System.out.println();
			i++;
		}
	}
}