import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char character = s.next().charAt(0);
		System.out.println("ASCII value of \'" + character + "\' is "
				+ (int) character);
	}
}