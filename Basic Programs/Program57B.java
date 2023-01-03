import java.util.Scanner;

public class Program57B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string number in odd length");
		String string = scanner.next();
		int i = 0;
		while (i < string.length()) {
			int j = 0;
			while (j < string.length()) {
				if (i == j || j == string.length() - i - 1)
					System.out.print(string.charAt(j));
				else
					System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}