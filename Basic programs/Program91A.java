import java.util.Scanner;

public class Program91A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		char array[] = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
			}
			char temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
		System.out
				.println("After sorting the characters in a word in descending");
		for (char character : array)
			System.out.print(character + " ");
	}
}