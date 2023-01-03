import java.util.Scanner;

public class Program52B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		String stringArray[] = string.split(" ");
		printArray(stringArray, stringArray.length);
	}

	public static void printArray(String array[], int index) {
		if (index <= 0)
			return;
		System.out.println(array[index - 1]);
		printArray(array, index - 1);
	}
}