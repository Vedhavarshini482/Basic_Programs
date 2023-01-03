import java.util.Scanner;

public class Program59B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string1 = scanner.next();
		System.out.println("Enter the second String");
		String string2 = scanner.next();
		int count = 0, i = 0;
		while (i < string2.length()) {
			int j = 0;
			while (j < string1.length()) {
				if (string2.charAt(i) == string1.charAt(j))
					count++;
				j++;
			}
			i++;
		}
		if (count == string2.length())
			System.out.println(string1.indexOf(string2.charAt(0)));
		else
			System.out.println(-1);
	}
}