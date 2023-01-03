import java.util.Scanner;

public class Program82B {

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
		while (i < row) {
			int j = 0;
			while (j < column) {
				if (i > j)
					array[i][j] = 0;
				j++;
			}
			i++;
		}
		for (i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}