import java.util.Scanner;

public class Program81A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter the size of the row and column of the first array");
		int row1 = scanner.nextInt(), column1 = scanner.nextInt();
		int array1[][] = new int[row1][column1];
		System.out.println("Enter the array elements");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++)
				array1[i][j] = scanner.nextInt();
		}
		System.out
				.println("Enter the size of the row and column of the second array");
		int row2 = scanner.nextInt(), column2 = scanner.nextInt();
		int array2[][] = new int[row2][column2];
		System.out.println("Enter the array elements");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < column2; j++)
				array2[i][j] = scanner.nextInt();
		}
		if (row1 != row2 || column1 != column2) {
			System.out.println("The two matrices are not equal");
			return;
		}
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				if (array1[i][j] != array2[i][j]) {
					System.out.println("The two matrices are not equal");
					return;
				}
			}
		}
		System.out.println("The two matrices are equal");
	}
}