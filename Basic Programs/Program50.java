import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many row to be printed");
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--) {
			for (int j = i; j < number; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}