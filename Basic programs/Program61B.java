import java.util.Scanner;

public class Program61B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		Program61B program = new Program61B();
		program.display(array, array.length);
	}

	public void display(int array[], int length) {
		if (length - 1 < 0)
			return;
		else {
			System.out.print(array[length - 1] + " ");
			display(array, length - 1);
		}
	}
}