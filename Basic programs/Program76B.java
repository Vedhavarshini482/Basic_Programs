import java.util.Scanner;

public class Program76B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row and column size of an array");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				array[i][j] = scanner.nextInt();
		int transpose[][] = new int[column][row];
		int i = 0;
		while (i < column) {
			int j = 0;
			while (j < row) {
				transpose[i][j] = array[j][i];
				System.out.print(transpose[i][j] + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}