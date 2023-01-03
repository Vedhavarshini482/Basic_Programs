import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of row and column");
		int row = s.nextInt(), col = s.nextInt();
		int array[][] = new int[row][col];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				array[i][j] = s.nextInt();
		}
		System.out
				.println("Enter how many times do you want to rotate the Multi dimentional Array");
		int rotate = s.nextInt();
		for (int i = 0; i < rotate; i++) {
			for (int j = 0; j < array.length; j++) {
				int temp = array[j][array[j].length - 1];
				for (int k = array.length - 1; k > 0; k--)
					array[j][k] = array[j][k - 1];
				array[j][0] = temp;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}