import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		String stringArray[] = string.split(" ");
		String reverse = "";
		for (int i = stringArray.length - 1; i >= 0; i--)
			reverse += stringArray[i] + " ";
		System.out.println(reverse.substring(0, reverse.length() - 1));
	}
}