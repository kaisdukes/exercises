package problems.codility;

public class CountDiv {

    // Given three integers A, B and K, returns the number of integers within the range [A..B]
    // that are divisible by K.
    public static int countDiv(final int a, final int b, final int k) {

        if (a > b) {
            throw new IllegalArgumentException("a should be <= b");
        }

        if (k < 1) {
            throw new IllegalArgumentException("k should be >= 1");
        }

        return b / k - (a % k == 0 ? a : a + k - a % k) / k + 1;
    }
}