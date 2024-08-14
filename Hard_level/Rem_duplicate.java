package Hard_level;

public class Rem_duplicate {

	public static void main(String[] args) {

		//duplicates from array
		
//		char c[] = {'a','a','c','b','c','a'};
//		char z[] = new char[c.length];
//		
//		for(int i=0; i<c.length; i++) {
//			for(int j=i+1; j<c.length; j++) {
//				if(c[i]==c[j]) {
//					z[i]=c[i];
//					c[j] = '\u0000';
//				}
//			}
//		}
//		
//		for (int k = 0; k < z.length; k++) {
//            if (z[k] != '\u0000') {
//                System.out.println(z[k]);
//            }
//        }
		
		
		//AA
		
		char c[] = {'a','a','c','b','c','a'};
		
		for(int i=0; i<c.length; i++) {
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j]) {
					c[j] = '\u0000';
				}
			}
		}
		
		for (int k = 0; k < c.length; k++) {
            if (c[k] != '\u0000') {
                System.out.println(c[k]);
            }
        }
	}
}
