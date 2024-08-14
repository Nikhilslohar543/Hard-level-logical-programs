package Hard_level;

public class MissingFromArray {

	public static void main(String[] args) {

		 int a[] = {1, 2, 3, 5};
	        int n = a.length + 1; // Length of the original array including the missing element
	        
	        // Calculate the expected sum of the first n natural numbers
	        int expectedSum = (n * (n + 1)) / 2;

	        // Calculate the actual sum of the given array
	        int actualSum = 0;
	        for (int i = 0; i < a.length; i++) {
	            actualSum += a[i];
	        }

	        // The missing element is the difference between the expected sum and the actual sum
	        int missingElement = expectedSum - actualSum;
	        System.out.println("The missing element is: " + missingElement);
		
	}

}
