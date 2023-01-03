import java.util.Scanner;

public class Program91B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		char array[] = string.toCharArray();
		int i = 0;
		while (i < array.length) {
			int maxIndex = i, j = i + 1;
			while (j < array.length) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
				j++;
			}
			char temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
			i++;
		}
		System.out
				.println("After sorting the characters in a word in descending");
		for (char character : array)
			System.out.print(character + " ");
	}
}