import java.util.Scanner;

public class Program96B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		char array[] = string.toCharArray();
		System.out.println("Enter a character ");
		char target = scanner.next().charAt(0);
		Program96A program = new Program96A();
		if (program.contains(array, target))
			System.out.println("String \"" + string
					+ "\" contains the character \'" + target + "\'");
		else
			System.out.println("String \"" + string
					+ "\" not contains the character \'" + target + "\'");
	}

	public boolean contains(char arr[], char target, int index) {
		if (index < 0)
			return false;
		if (arr[index] == target)
			return true;
		else
			contains(arr, target, index + 1);
		return false;
	}
}