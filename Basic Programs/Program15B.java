import java.util.Scanner;

public class Program15B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius and height of the Cylinder");
		int radius = scanner.nextInt(), height = scanner.nextInt();
		int area = (int) ((2 * 3.14 * radius) * (radius + height));
		System.out.println("Area of the Cylinder = " + area);
	}
}