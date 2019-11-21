package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		String str ="";
		System.out.println("Enter Name");
		str = scan.nextLine();
		
		
		//String str = "Sreekanth";
		System.out.println(reverse(str));
		
	}

	private static String reverse(String str) {
		String reverse="";
		for(int i = str.length()-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);	
	}
		return reverse;
	}
}
	


