import java.util.Scanner;

public class Program43 {

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
		for (int i = 0; i < rotate; i++) {
			int temp = array[0];
			for (int j = 0; j < array.length - 1; j++)
				array[j] = array[j + 1];
			array[array.length - 1] = temp;
		}
		System.out.println("After " + rotate + " rotation ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}