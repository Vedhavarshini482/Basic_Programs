import java.util.Scanner;

public class Program14B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int length = scanner.nextInt(), breadth = scanner.nextInt();
		int area = length * breadth;
		System.out.println("Area of the rectangle = " + area);
	}
}