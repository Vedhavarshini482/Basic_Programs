import java.util.Scanner;

public class Program69B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements in the array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out
				.println("Enter how many times rotate the array in right side");
		int i = 0;
		int rotate = scanner.nextInt();
		while (i < rotate) {
			int temp = array[array.length - 1], j = array.length - 1;
			while (j > 0) {
				array[j] = array[j - 1];
				j--;
			}
			array[0] = temp;
			i++;
		}
		System.out.println("After " + rotate + " rotation ");
		for (int j : array)
			System.out.print(j + " ");
	}
}