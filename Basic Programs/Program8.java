public class Program8 {
	static int a = 0;

	public static void main(String[] args) {
		int b = 5;
		staticKeyword(b);
		System.out.println("b = " + b);
		staticKeyword(b);
		System.out.println("b = " + b);
	}

	public static void staticKeyword(int b) {
		System.out.println("Without creating an object you can call me");
		System.out.println("a = " + a++);
		b++;
	}
}