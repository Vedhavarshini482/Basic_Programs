import java.util.Scanner;

public class Program92B {

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
		swap(array, n + 1, n);
		sorting(array, n + 1);
	}

	public static void swap(String array[], int i, int n) {
		if (i == array.length)
			return;
		if (array[n].compareTo(array[i]) > 0) {
			String temp = array[n];
			array[n] = array[i];
			array[i] = temp;
		}
		swap(array, i + 1, n);
	}
}