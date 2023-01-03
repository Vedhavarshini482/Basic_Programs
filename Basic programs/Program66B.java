import java.util.Scanner;

public class Program66B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out
				.println("Enter how many times rotate the array in left side");
		int rotate = scanner.nextInt();
		int i = 0;
		while (i < rotate) {
			int temp = array[0];
			int j = 0;
			while (j < array.length - 1) {
				array[j] = array[j + 1];
				j++;
			}
			array[array.length - 1] = temp;
			i++;
		}
		System.out.println("After " + rotate + " rotation ");
		for (int j : array)
			System.out.print(j + " ");
	}
}