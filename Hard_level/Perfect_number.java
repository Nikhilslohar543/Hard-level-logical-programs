package Hard_level;

import java.util.Scanner;

public class Perfect_number {

	public static boolean perfect(int a) {
		if(a<=1) {
			return false;
		}		
		int sum =0;
		
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum==a;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to check perfect or not :");
		int a = s.nextInt();
		
		if (perfect(a)) {
			System.out.println("is perfect number");
		} else {
			System.out.println("not perfect number");
		}

	}

}
