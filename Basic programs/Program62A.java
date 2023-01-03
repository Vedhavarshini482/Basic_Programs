import java.util.Scanner;

public class Program62A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		System.out.println("Elements in odd position");
		for (int i = 0; i < array.length; i += 2)
			System.out.print(array[i] + " ");
		System.out.println("\nElements in even position");
		for (int i = 1; i < array.length; i += 2)
			System.out.print(array[i] + " ");
	}
}