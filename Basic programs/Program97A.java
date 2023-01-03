import java.util.Scanner;

public class Program97A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		char array[] = string.toCharArray();
		System.out.println("Enter a character ");
		char target = scanner.next().charAt(0);
		Program97A program = new Program97A();
		int value = program.binarySearch(array, target);
		if (value == -1)
			System.out.println("String \"" + string
					+ "\" not contains the character \'" + target + "\'");
		else
			System.out.println("String \"" + string
					+ "\" contains the character \'" + target + "\'");
	}

	public int binarySearch(char arr[], char target) {
		int start = 0;
		int end = arr.length - 1;
		boolean ascending = false;
		if (arr[start] < arr[end])
			ascending = true;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (ascending) {
				if (target > arr[mid])
					start = mid + 1;
				else if (target < arr[mid])
					end = mid - 1;
				else
					return mid;
			} else {
				if (target > arr[mid])
					end = mid - 1;
				else if (target < arr[mid])
					start = mid + 1;
				else
					return mid;
			}
		}
		return -1;
	}
}