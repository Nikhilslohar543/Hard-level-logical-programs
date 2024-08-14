package Hard_level;

public class Second_duplicate {

	public static void main(String[] args) {
		
		int a[] = {11,22,11,33,44,22,44,44,11,22,33,44,44,22};
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && a[i]!=0) {
					a[j]=0;
					count++;
					if(count==2)
						System.out.println(a[i]);
						break;
				}
			}
		}
		
		char ch[] = { 'a','s', 'b', 's', 'a', 'b' };
		int c =0;
		
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j] && i!=j) {
					ch[j]=0;
					c++;
					if(c==2) {
						System.out.println(ch[i]);
						break;
					}
				}
			}
		}
	}
}
