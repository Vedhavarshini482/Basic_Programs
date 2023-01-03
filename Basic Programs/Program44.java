import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					list.add(array[j]);
			}
		}
		System.out.println("Duplicates elements are ");
		System.out.print(list);
	}
}