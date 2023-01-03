import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int length = scanner.nextInt(), breadth = scanner.nextInt();
		System.out.println("Area of the rectangle = " + (length * breadth));
	}
}