package Hard_level;

public class Unique_number {

	public static void main(String[] args) {

		// character array

		char c[] = { 'a', 'b', 's', 'a', 'b' };
		char count1[] = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			count1[i] = 1;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j] && i != j) {
					count1[i]++;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (count1[i] == 1) {
				System.out.println("Unique character :"+c[i]);
			}
		}

		// integer array

		int a[] = { 11, 22, 11, 33, 44, 22, 44, 44 };
		int count[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			count[i] = 1;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					count[i]++;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			if (count[k] == 1) {
				System.out.println("Unique integer :"+a[k]);
			}
		}

	}
}
