import java.util.Scanner;

public class Program93B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		char array[] = string.toCharArray();
		Program93A program = new Program93A();
		program.sorting(array, array.length, 0);
		System.out
				.println("After sorting the characters in a word in descending");
		for (char character : array)
			System.out.print(character + " ");
	}

	public void sorting(char array[], int n) {
		if (n == array.length)
			return;
		swap(array, n, n + 1);
		sorting(array, n + 1);
	}

	public static void swap(char array[], int i, int j) {
		if (j == array.length)
			return;
		if (array[i] < array[j]) {
			i = j;
			swap(array, i, j + 1);
		}
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}