import java.util.Scanner;

public class Program61A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		System.out.println("The elements of an array in reverse order");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}
}