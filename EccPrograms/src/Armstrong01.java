public class Armstrong01 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 125;
		System.out.println(generateArmstrongNums(num1, num2));
		//System.out.println(getDigits(25));
		//System.out.println(power(3, 3));

	}

	public static String generateArmstrongNums(int start, int limit) {
		if (start <= 0 || limit <= 0) {
			return "-1";
		}
		if (start >= limit) {
			return "-2";
		}
		String str ="";
	for(int n = start; n<=limit; n++) {
		if(isArmstrong(n)) {
			str +=n +",";
		}
		if(str.length()==0) {
			str ="-3";
		}
	}
		return str.substring(0,str.length()-1);
	}

	public static boolean isArmstrong(int num) {
		return (num == sumOfPowersOfDigits(num));
	}

	public static int sumOfPowersOfDigits(int n) {
	
		return n;
		
	}

	public static int[] getDigits(int n) {
		String str = "";
		str = str + n;
		int arr[] = new int[str.length()];
		int i = 0;
		while (n > 0) {
			arr[i++] = n % 10;
			n = n / 10;
		}
		return arr;
	}

	public static int power(int d, int p) {
		int pw = 1;
		for (int i = 0; i < p; i++) {
			pw = pw * d;
		}
		return pw;
	}
}
