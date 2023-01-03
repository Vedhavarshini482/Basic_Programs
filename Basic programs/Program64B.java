import java.util.Scanner;

public class Program64B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		int copiedArray[] = array.clone();
		System.out.println("Copied Array elements are");
		for (int i : copiedArray)
			System.out.print(i + " ");
	}
}