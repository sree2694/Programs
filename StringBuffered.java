package String;

import java.util.Scanner;

public class StringBuffered {

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuilder sb = new StringBuilder(str);

		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());

	}

}