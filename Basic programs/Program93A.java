import java.util.Scanner;

public class Program93A {

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

	public void sorting(char arr[], int n, int index) {
		if (index == n)
			return;
		int k = swap(arr, index, n - 1);
		if (k != index) {
			char temp = arr[k];
			arr[k] = arr[index];
			arr[index] = temp;
		}
		sorting(arr, n, index + 1);
	}

	public static int swap(char arr[], int i, int j) {
		if (i == j)
			return i;
		int k = swap(arr, i + 1, j);
		return (arr[i] > arr[k]) ? i : k;
	}
}