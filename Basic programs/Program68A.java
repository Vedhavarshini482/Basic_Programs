import java.util.Scanner;

public class Program68A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		System.out.println("The sum of all the items of the array " + sum);
	}
}