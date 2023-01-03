import java.util.ArrayList;
import java.util.Scanner;

public class Program67A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					duplicate.add(j);
			}
		}
		System.out.println("Dupicate Elements are ");
		for (int i = 0; i < duplicate.size(); i++)
			System.out.print(array[duplicate.get(i)] + " ");
	}
}