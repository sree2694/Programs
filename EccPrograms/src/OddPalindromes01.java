public class OddPalindromes01 {
	public static void main(String[] args) {
		int num1 = 1500;
		int num2 = 2000;
		System.out.println(generateOddPalindromes(num1, num2));
		// System.out.println(reverse(123));
		// System.out.println(isPalindrome(123));
		// System.out.println(isAllDigitsOdd(123));
	}

	public static String generateOddPalindromes(int start, int limit) {
		String str = "";
		if (start <= 0 || limit <= 0) {
			return "-1";
		}
		if (start >= limit) {
			return "-2";
		}

		for (int i = start; i <= limit; i++) {
			if (isPalindrome(i) && isAllDigitsOdd(i)) {
				str += i + ",";
			}
		}
		return str.substring(0, str.length() - 1);

	}

	public static boolean isPalindrome(int num) {
		if (num == reverse(num))
			return true;
		else
			return false;
	}

	public static int reverse(int num) {
		int r, s = 0;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			s = s * 10 + r;
		}
		return s;
	}

	public static boolean isAllDigitsOdd(int num) {
		int digit = 0, oddcount = 0, count = 0;
		while (num > 0) {
			digit = num % 10;
			if (digit != 0) {
				if (digit % 2 == 0)
					return false;
			}
			num /= 10;
		}
		return true;
	}
}