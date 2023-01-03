import java.util.Scanner;

public class Program50B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many row to be printed");
		int number = scanner.nextInt();
		int i = number;
		while (i >= 1) {
			int j = i;
			while (j < number) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while (j <= i) {
				System.out.print(i + " ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}