import java.util.Scanner;

public class Program62B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		System.out.println("Elements in Odd position");
		int i = 0;
		while (i < array.length) {
			if (i % 2 == 0)
				System.out.print(array[i] + " ");
			i++;
		}
		i = 0;
		System.out.println("\nElements in Even Position");
		while (i < array.length) {
			if (i % 2 == 1)
				System.out.print(array[i] + " ");
			i++;
		}
	}
}