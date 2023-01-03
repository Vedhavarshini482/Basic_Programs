import java.util.Scanner;

public class Program56B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int j = 1, i = 1;
		while (j <= number) {
			int k = 1;
			while (k <= (number / 2) - i) {
				System.out.print(" ");
				k++;
			}
			k = 1;
			while (k <= i && j <= number) {
				System.out.print(j + " ");
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}