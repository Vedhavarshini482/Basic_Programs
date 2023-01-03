import java.util.Scanner;

public class Program74B {

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
		int i = 0;
		while (i < row) {
			int j = 0;
			while (j < column) {
				product[i][j] = 0;
				int k = 0;
				while (k < column) {
					product[i][j] += array1[i][k] * array2[k][j];
					k++;
				}
				System.out.print(product[i][j] + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}