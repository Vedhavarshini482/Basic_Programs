import java.util.Scanner;

public class Program64A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		int copiedArray[] = new int[array.length];
		for (int i = 0; i < array.length; i++)
			copiedArray[i] = array[i];
		System.out.println("Copied Elements are:");
		for (int i : copiedArray)
			System.out.print(i + " ");
	}
}