package problems.codility;

public class TapeEquilibrium {

    // A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
    //
    // Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
    // A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
    //
    // The difference between the two parts is the value of
    // |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
    //
    // Find the minimal difference that can be achieved.
    public static int findMinimalDifference(final int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        if (array.length < 2) {
            throw new IllegalArgumentException("Array length should be >= 2");
        }

        int sum = 0;
        for (final int element : array) {
            sum += element;
        }

        int left = 0;
        int right = sum;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            final int element = array[i];
            left += element;
            right -= element;
            int diff = left >= right ? left - right : right - left;
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }
}