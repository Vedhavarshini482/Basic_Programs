import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius and height of the Cylinder");
		int radius = scanner.nextInt(), height = scanner.nextInt();
		System.out.println("Area of the Cylinder = "
				+ (int) ((2 * 3.14 * radius) * (radius + height)));
	}
}