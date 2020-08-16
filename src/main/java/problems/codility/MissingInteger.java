package problems.codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    // Given an array A of N integers, returns the smallest positive integer (greater than 0)
    // that does not occur in A. Write an efficient algorithm.
    public static int findMissingInteger(final int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        final Set<Integer> positiveIntegers = new HashSet<>();
        for (final int e : array) {
            if (e > 0) {
                positiveIntegers.add(e);
            }
        }

        int result = 1;
        while (positiveIntegers.contains(result)) {
            result++;
        }

        return result;
    }
}