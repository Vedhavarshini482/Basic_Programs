import java.util.Scanner;

public class Program65A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		int frequency[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = -1;
					count++;
				}
			}
			if (array[i] != -1)
				frequency[i] = count;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1)
				System.out.println(array[i] + " occurs " + frequency[i]
						+ " times ");
		}
	}
}