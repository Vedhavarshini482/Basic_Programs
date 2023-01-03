import java.util.Scanner;

public class Program47B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int number = scanner.nextInt();
		int i = 1;
		while (i <= number) {
			int j = 1;
			while (j <= 2 * (number - i)) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			j = i - 1;
			while (j >= 1) {
				System.out.print(j + " ");
				j--;
			}
			System.out.println();
			i++;
		}
	}
}