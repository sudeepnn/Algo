import java.util.*;

public class PrimeFactor {

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a no. : ");
		x = sc.nextInt();
		for (int i = 2; i <= x; i++) {
			if (isPrime(i)) {
				if (x % i == 0)
					System.out.println(i);
			}
		}
	}
}
