import java.util.Scanner;


public class Program80A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of rows and column of an array");
		int row=scanner.nextInt(),column=scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				array[i][j] = scanner.nextInt();
		int zero = 0, number = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] != 0)
					number++;
				else
					zero++;
		}
		if (zero > number)
			System.out.println("Given Matrix is a sparse matrix");
		else
			System.out.println("Given Matrix is not a sparse matrix");
	}
}