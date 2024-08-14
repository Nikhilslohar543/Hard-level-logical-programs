package Hard_level;

public class Rev_array {

	public static void main(String[] args) {

		int c[] = {1,2,3,4,5};
		int start = 0;
		int end = c.length-1;
		
		while(start<end) {
			int temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

}
