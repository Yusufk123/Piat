package org.piat;

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
}
