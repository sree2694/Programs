package PrimeNumbers;

import java.util.stream.IntStream;

public class PrintPrimeNumber {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	  IntStream.rangeClosed(2, 1000)
      .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
              .allMatch(j -> i%j != 0))
      .forEach(n -> {
          System.out.println(n);
      });
    }
}
