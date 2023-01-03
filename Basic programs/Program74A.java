import java.util.Scanner;

public class Program74A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the rows and columns two arrays");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array1[][] = new int[row][column];
		int array2[][] = new int[row][column];
		int product[][] = new int[row][column];
		System.out.println("Enter the first array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				array1[i][j] = scanner.nextInt();
		}
		System.out.println("Enter the second array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				array2[i][j] = scanner.nextInt();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				product[i][j] = 0;
				for (int k = 0; k < column; k++)
					product[i][j] += array1[i][k] * array2[k][j];
				System.out.print(product[i][j] + " ");
			}
			System.out.println();
		}
	}
}