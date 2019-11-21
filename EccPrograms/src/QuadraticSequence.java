public class QuadraticSequence {

	public static void main(String[] args) {
		System.out.println(QuadraticSequence.getQuadricSequence(5));

	}

	public static String getQuadricSequence(int n) {
		if (n <= 0)
			return null;
		int sum = 1;

		String Seq = "1,";
		for (int i = 2; i <= n; i++) {
			sum += i;
			Seq += sum + ",";

		}
		return Seq.substring(0, Seq.length() - 1);
	}

}
