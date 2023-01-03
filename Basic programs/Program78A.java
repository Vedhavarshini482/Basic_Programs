import java.util.Scanner;

public class Program78A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the rows and columns");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array1[][] = new int[row][column];
		int array2[][] = new int[row][column];
		int addition[][] = new int[row][column];
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
				addition[i][j] = array1[i][j] - array2[i][j];
				System.out.print(addition[i][j] + " ");
			}
			System.out.println();
		}

	}

}
