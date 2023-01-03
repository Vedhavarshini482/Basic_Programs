import java.util.Scanner;

public class Program79A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of row and column of an array");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i][i] != 1) {
				System.out.println("Given matix is not an Identity matrix");
				return;
			}
		}
		System.out.println("Given matix is an Identity matrix");
	}
}