package hackerEarthPractice.math.BasicNumberTheory1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mystery {
	public static void main(String trs[]) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		while (t > 0) {
			long some = s.nextLong();
			System.out.println(getDivisors(some));
			t--;
		}
	}

	public static long getDivisors(long num) {
		Set<Long> factors = new HashSet<Long>();
		for (long l = 1; l < Math.sqrt(num) + 1; l++) {
			if (num % l == 0) {
				factors.add(l);
				factors.add(num / l);
			}
		}
		return factors.size();

	}
}
