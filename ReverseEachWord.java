package String;
/*Reverse Each word in the string */ 
public class ReverseEachWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseEachWordOfString("Java Concept Of The Day");
	}
	public static void reverseEachWordOfString(String inputString) {
		// TODO Auto-generated method stub
		String[] words = inputString.split(" ");
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}

}
