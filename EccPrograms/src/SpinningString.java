public class SpinningString {
	public static void main(String[] arg) {
		System.out.println(SpinningString.rotate("talent", 1));
		System.out.println(SpinningString.rotate("talent", 2));
		System.out.println(SpinningString.rotate("talent", 3));

	}

	public static String rotate(String str, int no_of_positions) {

		if (str == null || str == "") {
			return null;
		}
		if (no_of_positions <= 0) {
			return str;
		}
		if (str.length() == no_of_positions) {
			return str;
		}
		String rev = "";
		for (int i = str.length() - no_of_positions; i < str.length(); i++) {
			{
				rev = rev + str.charAt(i);
			}

		}
		for (int i = 0; i < str.length() - no_of_positions; i++)
			rev = rev + str.charAt(i);

		return rev;

	}
}