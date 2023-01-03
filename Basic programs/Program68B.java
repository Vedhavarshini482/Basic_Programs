import java.util.Scanner;

public class Program68B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		Program68B program = new Program68B();
		System.out.print("Sum of elements in an array ");
		System.out.print(program.sumOfArrayElements(array, array.length));
	}

	public int sumOfArrayElements(int array[], int length) {
		if (length <= 0)
			return 0;
		return array[length - 1] + sumOfArrayElements(array, length - 1);
	}
}