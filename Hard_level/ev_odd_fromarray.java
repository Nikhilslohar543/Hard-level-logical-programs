package Hard_level;

public class ev_odd_fromarray {

	public static void main(String[] args) {
		
		int c[] = {1,2,3,4,5};

		for(int i=0; i<=c.length; i++) {
			if(i%2==0) {
				System.out.println("even numbers :"+i);
			}
			else{
				System.out.println("odd number :"+i);
			}
		}
		
	}

}
