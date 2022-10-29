package org.piat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Returns the number located at the nth term of the Fibonacci Sequence using a recursive method.
 * @author Yusuf Kounnichi
 */
public class fibRecursive {
	/**
	 * Finds the number located at the nth term of the Fibonacci Sequence recursively.
	 * @param n The term to count to.
	 * @return Returns the calculated number.
	 */

	public static int fibR(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibR(n - 1)+fibR(n - 2);
		}
	}

	@Test
	void fibRTest10(){
		assertEquals(55, fibR(10));
	}
	@Test
	void fibRTest21(){
		assertEquals(10946, fibR(21));
	}
}
