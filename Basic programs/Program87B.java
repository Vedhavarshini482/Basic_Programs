import java.util.Scanner;

public class Program87B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the character array");
		int row = scanner.nextInt();
		char array[] = new char[row];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			array[i] = scanner.next().charAt(0);
		String string = "";
		int i = 0;
		while (i < array.length) {
			string += array[i];
			i++;
		}
		System.out.print(string);
	}
}