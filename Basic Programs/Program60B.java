import java.util.Scanner;

public class Program60B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int terms = scanner.nextInt();
		int sum = 0, i = 1;
		while (i <= terms)
			sum = (sum * 10) + i++;
		System.out.println(sum);
	}
}