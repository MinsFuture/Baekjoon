import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int max;

		if (x == y && y == z)
			System.out.println(10000 + x * 1000);

		else if (x != y && y != z && x != z) {
			max = x;

			if (y > max)
				max = y;
			if (z > max)
				max = z;

			System.out.println(max * 100);
		}

		else {
			if (x == y)
				System.out.println(1000 + x * 100);
			else if (y == z)
				System.out.println(1000 + y * 100);
			else
				System.out.println(1000 + z * 100);
		}
	}
}
