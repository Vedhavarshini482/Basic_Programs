import java.util.Scanner;

public class Program89B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		String stringArray[] = new String[string.length()];
		int i = 0, j = 0, count = 0;
		while (i < string.length()) {
			String temp = "";
			while (i < string.length() && string.charAt(i) != ' ') {
				temp += string.charAt(i++);
				count++;
			}
			stringArray[j] = temp;
			i++;
			j++;
		}
		for (i = 0; i <= stringArray.length - count; i++) {
			System.out.println(stringArray[i]);
		}
	}
}