import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter two numbers to define the functionality of a Bitwise operators");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));
		System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));
		System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));
		System.out.println(num1 + " ~ " + num2 + " = " + (num1 >> num2));
		System.out.println(num1 + " << " + num2 + " = " + (num1 << num2));
		System.out.println(" ~ " + num1 + " = " + (~num1));
		System.out.println(" ~ " + num2 + " = " + (~num2));
	}
}