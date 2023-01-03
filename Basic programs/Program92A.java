import java.util.Scanner;

public class Program92A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the String Array");
		int size = scanner.nextInt();
		String string[] = new String[size];
		for (int i = 0; i < size; i++)
			string[i] = scanner.next();
		Program92A program = new Program92A();
		program.sorting(string, 0);
		for (String s : string)
			System.out.println(s);
	}

	public void sorting(String array[], int n) {
		if (array.length == n)
			return;
		for (int j = n + 1; j < array.length; j++) {
			if (array[n].compareTo(array[j]) > 0) {
				String temp = array[n];
				array[n] = array[j];
				array[j] = temp;
			}
		}
		sorting(array, n + 1);
	}
}