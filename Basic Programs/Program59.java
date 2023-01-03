import java.util.Scanner;

public class Program59 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string1 = scanner.next();
		System.out.println("Enter the second String");
		String string2 = scanner.next();
		int count = 0;
		for (int i = 0; i < string2.length(); i++) {
			for (int j = 0; j < string1.length(); j++) {
				if (string2.charAt(i) == string1.charAt(j))
					count++;
			}
		}
		if (count == string2.length())
			System.out.println(string1.indexOf(string2.charAt(0)));
		else
			System.out.println(-1);
	}
}