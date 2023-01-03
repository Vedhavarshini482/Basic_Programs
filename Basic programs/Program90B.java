import java.util.Scanner;

public class Program90B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the String Array");
		int size = scanner.nextInt();
		String string[] = new String[size];
		for (int i = 0; i < size; i++)
			string[i] = scanner.next();
		int i = 0;
		while (i < size) {
			int j = i + 1;
			while (j < size) {
				if (string[i].compareTo(string[j]) > 0) {
					String temp = string[i];
					string[i] = string[j];
					string[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println("The given string in alphabetical order ");
		for (String s : string)
			System.out.println(s);
	}
}