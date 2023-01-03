import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Students Strength");
		int strength = scanner.nextInt();
		System.out.println("Enter Students roll number starts with");
		int start = scanner.nextInt();
		int end = strength + start - 1;
		System.out.println("Enter how many groups to be divide");
		int group = scanner.nextInt();
		int[][] groups = new int[group][(strength / group) + (strength % group)];
		for (int row = 0; row < group; row++) {
			for (int j = row + start, column = 0; j <= end; j += group, column++)
				groups[row][column] = j;
		}
		for (int i = 0; i < groups.length; i++) {
			System.out.println("Group " + (i + 1) + "");
			for (int j = 0; j < groups[i].length; j++) {
				if (groups[i][j] != 0)
					System.out.println(groups[i][j]);
			}
			System.out.println();
		}
	}
}