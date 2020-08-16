package problems.codility;

public class PermCheck {

    // A non-empty array A consisting of N integers is given. Check whether
    // array A is a permutation. Write an efficient algorithm.
    public static boolean isPermutation(final int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        final int n = array.length;
        final boolean[] values = new boolean[n];

        for (final int e : array) {
            int index = e - 1;
            if (index < 0 || index >= n) {
                return false;
            }
            if (values[index]) return false;
            values[index] = true;
        }

        for (int i = 0; i < n; i++) {
            if (!values[i]) {
                return false;
            }
        }

        return true;
    }
}