import java.util.Scanner;

public class Program75A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		System.out.println("Even Numbers in the array");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.println(array[i]);
		}
		System.out.println("Odd Numbers in the array");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				System.out.println(array[i]);
		}
	}
}