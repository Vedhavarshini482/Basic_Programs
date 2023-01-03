import java.util.Scanner;

public class Program95B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		String rev1 = "";
		String rev2 = "";
		int i = string1.length() - 1;
		while (i >= 0) {
			rev1 += string1.charAt(i);
			rev2 += string2.charAt(i);
			i--;
		}
		if (string1.equals(rev1))
			System.out.println(string1 + " is a palindrome");
		else
			System.out.println(string1 + " is not a palindrome");
		if (string2.equals(rev2))
			System.out.println(string2 + " is a palindrome");
		else
			System.out.println(string2 + " is not a palindrome");
	}
}