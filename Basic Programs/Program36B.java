import java.util.Scanner;

public class Program36B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("The Elements of an array in Even Position");
		int i = 1;
		while (i < array.length) {
			System.out.print(array[i] + " ");
			i += 2;
		}
	}
}