package Hard_level;

public class Duplates_array {

	public static boolean check(int n) {
		int last = n % 10;
		while (n > 0) {
			if (n % 10 != last) {
				return false;
			}
			n = n / 10;
		}
		return true;
	}

	public static void main(String[] args) {

		int x[] = { 22, 44, 11, 19, 10 };
		for (int i : x) {
			if (Duplates_array.check(i)) {
				System.out.println(i);
			}
		}

	}

}
