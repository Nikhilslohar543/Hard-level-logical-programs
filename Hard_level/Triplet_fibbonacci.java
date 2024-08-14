package Hard_level;

public class Triplet_fibbonacci {

	public static void main(String[] args) {

		int num = 5;
		int a=0;
		int b=1;
		int c=1;
		int sum =0;
		
		System.out.print(a+" "+b+" "+c);
		
		for(int i=0; i<=num; i++) {
			sum = a+b+c;
			System.out.print(" "+sum);
			a=b;
			b=c;
			c=sum;
			
		}
		
	}

}
