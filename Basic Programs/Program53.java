import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		char ch = ' ';
		for (int i = 0; i < string.length(); i++) {
			String s1 = "";
			int number = 0;
			if (!(string.charAt(i) >= '0' && string.charAt(i) <= '9'))
				ch = string.charAt(i);
			else {
				s1 += string.charAt(i);
				while ((i + 1 < string.length())
						&& (string.charAt(i + 1) >= '0' && string.charAt(i + 1) <= '9')) {
					s1 += string.charAt(++i);
				}
				number = Integer.parseInt(s1);
			}
			if (number != 0) {
				for (int j = 1; j <= number; j++)
					System.out.print(ch);
			}
		}
	}
}