import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter two numbers");
			int a = scanner.nextInt(), b = scanner.nextInt();
			if (i == 1)
				System.out.println("a = " + a + " , b = " + b + "\n++a-b?- = "
						+ (++a - b--));
			else if (i == 2)
				System.out.println("a = " + a + " , b = " + b + "\na%b++  = "
						+ (a % b++));
			else
				System.out.println("a = " + a + " , b = " + b + "\na*=b+5 is "
						+ (a *= b + 5));
		}
		System.out.println("69>>>2 = " + (69 >>> 2));
	}
}