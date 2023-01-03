import java.util.Scanner;

public class Program85A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the row and column of an array");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				array[i][j] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < array[i].length; j++) {
				sumOfRow += array[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + " = " + sumOfRow);
		}
		for (int i = 0; i < array.length; i++) {
			int sumOfColumn = 0;
			for (int j = 0; j < array[i].length; j++) {
				sumOfColumn += array[j][i];
			}
			System.out
					.println("Sum of column " + (i + 1) + " = " + sumOfColumn);
		}
	}
}