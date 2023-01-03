import java.util.Scanner;

public class Program70B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		int i = 1;
		while (i < array.length) {
			int j = i;
			while (j > 0) {
				if (array[j] < array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				} else
					break;
				j--;
			}
			i++;
		}
		System.out.println("Second Largest Number in an array "
				+ array[array.length - 2]);
	}
}