import java.util.Scanner;

public class Program84B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the row and column of an array");
		int row = scanner.nextInt(), column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				array[i][j] = scanner.nextInt();
		int oddNumber = 0, evenNumber = 0;
		int i = 0;
		while (i < array.length) {
			int j = 0;
			while (j < array[i].length) {
				if (array[i][j] % 2 == 0)
					evenNumber++;
				else
					oddNumber++;
				j++;
			}
			i++;
		}
		System.out.println("Frequency of Odd numbers " + oddNumber);
		System.out.println("Frequency of Even numbers " + evenNumber);
	}
}