import java.util.Scanner;

public class Program67B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("Duplicate elements are");
		int i = 0;
		while (i < array.length) {
			int j = i + 1;
			while (j < array.length) {
				if (array[i] == array[j])
					System.out.print(array[j] + " ");
				j++;
			}
			i++;
		}
	}
}