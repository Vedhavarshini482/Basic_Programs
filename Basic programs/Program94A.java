import java.util.Scanner;

public class Program94A {

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
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					char temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
				if (array2[i] < array2[j]) {
					char temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
			}
		}

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
}