import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++)
			arr[i] = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i += 2) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > i; j--)
				arr[j] = arr[j - 1];
			arr[i] = temp;
		}
		for (int i : arr)
			System.out.print(i + " ");
	}
}