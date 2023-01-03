import java.util.Scanner;

public class Program63B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length - 1; i++) {
			int maxIndex = i;
			boolean swapped = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[maxIndex] > array[j]) {
					swapped = true;
					maxIndex = j;
				}
			}
			if (!swapped)
				break;
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
		System.out.println("Largest Number in an array "
				+ array[array.length - 1]);
		System.out.println("Smallest Number in an array " + array[0]);
	}
}