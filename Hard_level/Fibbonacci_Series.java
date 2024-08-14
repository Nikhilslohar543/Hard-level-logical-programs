package Hard_level;

import java.util.Scanner;

public class Fibbonacci_Series {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number :");
		int num = s.nextInt();
		int a = 0;
		int b = 1;
		int sum;

		System.out.print(a+" "+b);
		for (int i = 0; i <= num; i++) {
			
			sum = a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}
	}
}
