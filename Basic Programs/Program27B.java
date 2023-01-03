import java.util.Scanner;

public class Program27B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After Swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}