import java.util.Scanner;

public class Program75B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		Program75B program = new Program75B();
		System.out.println("Odd numbers in the array");
		program.oddNumbers(array, array.length);
		System.out.println("Even Numbers in the array");
		program.evenNumbers(array, array.length);
	}

	public void oddNumbers(int array[], int length) {
		if (length <= 0)
			return;
		else {
			if (array[length - 1] % 2 != 0)
				System.out.println(array[length - 1]);
			oddNumbers(array, length - 1);
		}
	}

	public void evenNumbers(int array[], int length) {
		if (length <= 0)
			return;
		else {
			if (array[length - 1] % 2 == 0)
				System.out.println(array[length - 1]);
			evenNumbers(array, length - 1);
		}
	}
}