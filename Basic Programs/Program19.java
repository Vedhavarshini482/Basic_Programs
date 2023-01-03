public class Program19 {

	public static void main(String[] args) {
		int a = 28;
		System.out.println("a = " + a + "\na += a++ + ++a + --a + a-- is "
				+ (a += a++ + ++a + --a + a--));
	}
}