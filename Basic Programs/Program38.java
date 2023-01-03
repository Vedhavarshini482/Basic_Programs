import java.util.Scanner;

public class Program38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++)
			max = Math.max(max, array[i]);
		System.out.println("Largest element in the array " + max);
	}
}