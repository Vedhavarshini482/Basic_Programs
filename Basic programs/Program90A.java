import java.util.Scanner;

public class Program90A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the String Array");
		int size = scanner.nextInt();
		String string[] = new String[size];
		for (int i = 0; i < size; i++)
			string[i] = scanner.next();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (string[i].compareTo(string[j]) > 0) {
					String temp = string[i];
					string[i] = string[j];
					string[j] = temp;
				}
			}
		}
		System.out.println("The given string in alphabetical order ");
		for (String i : string)
			System.out.println(i);
	}
}