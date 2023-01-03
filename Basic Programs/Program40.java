import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println(array.length + " elements present in an array");
	}
}