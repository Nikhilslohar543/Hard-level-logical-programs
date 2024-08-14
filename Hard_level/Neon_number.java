package Hard_level;

public class Neon_number {

	public static void neon(int a) {
		
		int b = a*a;
		int sum =0;
		
		while(b!=0) {
			int digit = b%10;
			sum += digit;
			b=b/10;
		}
		
		if(a==sum) 
			System.out.println(a+" number is neon");
		else
			System.out.println(a+" is not neon");
	}
	
	public static void main(String[] args) {

		neon(9);		
	}

}
