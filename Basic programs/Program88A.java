import java.util.Scanner;

public class Program88A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		String stringArray[] = string.split(" ");
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);
	}
}