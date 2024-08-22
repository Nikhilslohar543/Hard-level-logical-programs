package tasks;

public class String_Operation {

	public static String check(String word, String largestword) {

		if (findDuplicate(word)) {
			if (largestword.length() < word.length()) {
				largestword = word;
			}
		}

		return largestword;
	}

	public static boolean findDuplicate(String word) {

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

			for (int j = i + 1; j < word.length(); j++) {

				if (c == word.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String s = "the kiran Academy";
		
		String s1 = s.toLowerCase();

		String largestword = "";

		String s2[] = s1.split(" ");

		for (String word : s2) {
			largestword = String_Operation.check(word,largestword);
		}
		
		System.out.println("largest word without duplictes :" + largestword);

	}
}
