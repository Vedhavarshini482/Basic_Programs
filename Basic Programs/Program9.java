import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the first and second Array");
		int size1 = scanner.nextInt(), size2 = scanner.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		System.out.println("Enter the first sorted Array :");
		for (int i = 0; i < size1; i++)
			arr1[i] = scanner.nextInt();
		System.out.println("Enter the second sorted Array :");
		for (int i = 0; i < size2; i++)
			arr2[i] = scanner.nextInt();
		int mergedArray[] = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0; i < mergedArray.length; i++) {
			if (i < arr1.length)
				mergedArray[i] = arr1[i];
			else
				mergedArray[i] = arr2[j++];
		}
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++)
				if (mergedArray[i] > mergedArray[j]) {
					int swap = mergedArray[i];
					mergedArray[i] = mergedArray[j];
					mergedArray[j] = swap;
				}
		}
		int j = 0, duplicate = 0;
		for (int i = 0; i < mergedArray.length - 1; i++) {
			if (mergedArray[i] != mergedArray[i + 1])
				mergedArray[j++] = mergedArray[i];
			else
				duplicate++;
		}
		mergedArray[j] = mergedArray[mergedArray.length - 1];
		System.out.println("Merged Array without duplicates");
		for (int i = 0; i < mergedArray.length - duplicate; i++)
			System.out.println(mergedArray[i]);
	}
}