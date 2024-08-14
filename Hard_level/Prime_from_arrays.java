package Hard_level;

public class Prime_from_arrays {

	static public boolean primeArray(int a) {
		
		if(a<=1) {
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
		int x[] = {1,2,3,4,5,11,19,10};

		for(int i=0; i<=x.length; i++) {
			if(primeArray(i)) {
				System.out.println(i);
			}
		}
	}

}
