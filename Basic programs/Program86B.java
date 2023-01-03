import java.util.Scanner;

public class Program86B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the character array");
		int row = scanner.nextInt();
		char array[] = new char[row];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < row; i++)
			array[i] = scanner.next().charAt(0);
		Program86B program = new Program86B();
		program.printCharacter(array, 0);
	}

	public void printCharacter(char array[], int length) {
		if (length == array.length)
			return;
		System.out.print(array[length] + " ");
		printCharacter(array, length + 1);
	}
}