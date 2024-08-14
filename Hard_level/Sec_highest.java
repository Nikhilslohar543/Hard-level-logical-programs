package Hard_level;

public class Sec_highest {

	public static void main(String[] args) {

		int a[] = { 11, 22, 55, 11, 33, 44, 22, 44, 44 };
		int max = a[0];
		int max2 = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max2 = max;
				max = a[i];
			} else if (max > a[i] && max2 < a[i]) {
				max2 = a[i];
			}
		}
		System.out.println("second largest is :" + max2);
	}

}
