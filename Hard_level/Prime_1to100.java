package Hard_level;

public class Prime_1to100 {

	public static boolean prime(int a) {

		if (a <= 1) {
			return false;
		}
		for (int j = 2; j <= a / 2; j++) {
			if (a % j == 0) {
				return false;
			}
		}
		return true;
	}
	 
	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}
}
