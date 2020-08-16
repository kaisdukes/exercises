package problems.codility;

import static java.lang.Math.max;

public class MaxCounters {

    // You are given N counters, initially set to 0, and you have two possible operations on them:
    //
    // increase(X) − counter X is increased by 1,
    // max counter − all counters are set to the maximum value of any counter.
    //
    // A non-empty array A of M integers is given. This array represents consecutive operations:
    //
    // if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
    // if A[K] = N + 1 then operation K is max counter.
    //
    // Calculate the value of every counter after all operations. Write an efficient algorithm.
    public static int[] evaluateOperations(final int n, final int[] a) {

        if (n < 1) {
            throw new IllegalArgumentException("n should be >= 1");
        }

        if (a == null) {
            throw new IllegalArgumentException("Array should not be null.");
        }

        final int[] counters = new int[n];
        int highestValue = 0;
        int lastMax = 0;
        for (final int op : a) {

            if (op < 1 || op > n + 1) {
                throw new IllegalArgumentException("Operation out of range: " + op);
            }

            if (op <= n) {

                // increase
                final int index = op - 1;
                final int counter = counters[index] = max(counters[index], lastMax) + 1;
                if (counter > highestValue) {
                    highestValue = counter;
                }

            } else {

                // max counter
                lastMax = highestValue;
            }
        }

        // update to last max (if required)
        for (int i = 0; i < n; i++) {
            if (counters[i] < lastMax) {
                counters[i] = lastMax;
            }
        }

        return counters;
    }
}