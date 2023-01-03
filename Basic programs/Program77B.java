import java.util.Scanner;

public class Program77B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		for (int i = 1; i < array.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swapped = true;
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			if (!swapped)
				break;
		}
		System.out.println("Arrays in ascending order");
		for (int i : array)
			System.out.print(i + " ");
	}

}
