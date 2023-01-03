import java.util.Scanner;

public class Program17B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the inner and outer circle");
		int innerCircle = scanner.nextInt(), outerCircle = scanner.nextInt();
		float concentricCircle = (float) (3.14 * (innerCircle + outerCircle) * (innerCircle - outerCircle));
		System.out.println("Space between two concentric circle = "
				+ concentricCircle);
	}
}