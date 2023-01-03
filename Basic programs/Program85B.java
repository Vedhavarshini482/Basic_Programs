import java.util.Scanner;

public class Program85B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the row and column of an array");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				array[i][j] = scanner.nextInt();
		int i = 0;
		while (i < array.length) {
			int sumOfRow = 0, j = 0;
			while (j < array[i].length) {
				sumOfRow += array[i][j];
				j++;
			}
			System.out.println("Sum of row " + (i + 1) + " = " + sumOfRow);
			i++;
		}
		i = 0;
		while (i < array.length) {
			int sumOfColumn = 0, j = 0;
			while (j < array[i].length) {
				sumOfColumn += array[j][i];
				j++;
			}
			System.out
					.println("Sum of column " + (i + 1) + " = " + sumOfColumn);
			i++;
		}
	}
}