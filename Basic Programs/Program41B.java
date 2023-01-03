import java.util.Scanner;

public class Program41B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		int duplicate[] = new int[size];
		int i = 0;
		while (i < array.length) {
			duplicate[i] = array[i++];
		}
		System.out
				.println("From the Array , the elements are copied which is given below");
		for (int j : duplicate)
			System.out.print(j + " ");
	}
}