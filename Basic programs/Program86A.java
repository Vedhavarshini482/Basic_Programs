import java.util.Scanner;

public class Program86A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the character array");
		int row = scanner.nextInt();
		char array[] = new char[row];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			array[i] = scanner.next().charAt(0);
		for (char i : array)
			System.out.print(i + " ");
	}
}