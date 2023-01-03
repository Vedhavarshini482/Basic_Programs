import java.util.Scanner;

public class Program45B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		sum = addition(array, 0);
		System.out.println("Sum of elements in the array is " + sum);
	}

	public static int addition(int array[], int index) {
		if (array.length <= index)
			return 0;
		return array[index] + addition(array, index + 1);
	}
}