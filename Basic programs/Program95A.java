import java.util.Scanner;

public class Program95A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		String reverse1 = "";
		for (int i = string1.length() - 1; i >= 0; i--)
			reverse1 += string1.charAt(i);
		String reverse2 = "";
		for (int i = string2.length() - 1; i >= 0; i--)
			reverse2 += string2.charAt(i);
		if (string1.equals(reverse1))
			System.out.println(string1 + " is a palindrome");
		else
			System.out.println(string1 + " is not a palindrome");
		if (string2.equals(reverse2))
			System.out.println(string2 + " is a palindrome");
		else
			System.out.println(string2 + " is not a palindrome");
	}
}