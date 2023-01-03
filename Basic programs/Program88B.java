import java.util.Scanner;

public class Program88B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		String stringArray[] = string.split(" ");
		Program88B program = new Program88B();
		program.printStringWithMethod(stringArray, 0);
	}

	public void printStringWithMethod(String stringArray[], int length) {
		if (length == stringArray.length)
			return;
		System.out.println(stringArray[length]);
		printStringWithMethod(stringArray, length + 1);
	}
}