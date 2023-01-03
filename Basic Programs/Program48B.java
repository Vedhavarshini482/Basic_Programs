import java.util.Scanner;

public class Program48B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int number = scanner.nextInt();
		int i = number;
		while (i >= 1) {
			int j = 1;
			while (j < 2 * i - 1) {
				System.out.print(" ");
				j++;
			}
			j = i;
			while (j <= number)
				System.out.print(j++ + " ");
			j = number - 1;
			while (j >= i)
				System.out.print(j-- + " ");
			System.out.println();
			i--;
		}
	}
}