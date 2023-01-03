import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("The Elements of an array in Odd Position");
		for (int i = 0; i < array.length; i += 2)
			System.out.print(array[i] + " ");
	}
}