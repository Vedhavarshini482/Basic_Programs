import java.util.Scanner;

public class Program94B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		if (string1.length() != string2.length()) {
			System.out.println("\"" + string1 + "\" and \"" + string2
					+ "\" are not an anagram to each other");
			return;
		}
		char array1[] = string1.toCharArray();
		char array2[] = string2.toCharArray();
		Program94B program = new Program94B();
		program.sorting(array1, 0);
		program.sorting(array2, 0);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				System.out.println("\"" + string1 + "\" and \"" + string2
						+ "\" are not an anagram to each other");
				return;
			}
		}
		System.out.println("\"" + string1 + "\" and \"" + string2
				+ "\" are an anagram to each other");
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