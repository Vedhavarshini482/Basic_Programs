import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int side = scanner.nextInt();
		System.out.println("Area of the square = " + (side * side));
	}
}