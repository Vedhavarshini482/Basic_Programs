import java.util.ArrayList;
import java.util.Scanner;

public class Program72B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>();
		int i = 0;
		while (i < array.length) {
			int j = i + 1;
			while (j < array.length) {
				if (array[i] == array[j] && array[j] != -1) {
					array[j] = -1;
				}
				j++;
			}
			if (array[i] != -1)
				withoutDuplicate.add(array[i]);
			i++;
		}
		System.out.println(withoutDuplicate);
	}
}