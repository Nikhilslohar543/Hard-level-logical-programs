package Hard_level;

public class SumOfMinMaxFromArray {

	public static void main(String[] args) {

		int c[] = { 11, 22,88, 66, 32, 41, 51 };
		int min = c[0];
		int max = c[0];

		for (int i = 0; i < c.length; i++) {
			if (c[i] > max) {
				min = max;
				max = c[i];
			} else if (c[i] < max && c[i] > min) {
				min = c[i];
			}
		}

		System.out.println("Minimum is :" + min);
		System.out.println("Maximum is :" + max);

		int minsum = 0;
		while (min != 0) {
			int digit = min % 10;
			minsum += digit;
			min = min / 10;
		}
		System.out.println("Minimum value sum is:" + minsum);

		int maxsum=0;
		while (max != 0) {
			int digit = max % 10;
			maxsum += digit;
			max = max / 10;
		}
		System.out.println("Maximum value sum is:" + maxsum);

	}

}
