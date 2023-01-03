import java.util.Scanner;

public class Program40B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		int count = 0;
		while (count < array.length)
			count++;
		System.out.println(count + " elements present in an array");
	}
}