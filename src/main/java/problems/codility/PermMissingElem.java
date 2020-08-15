package problems.codility;

public class PermMissingElem {

    // An array A consisting of N different integers is given. The array contains integers
    // in the range 1 to N + 1, which means that exactly one element is missing. Write an
    // efficient algorithm to find that missing element.
    public static int findMissingElement(final int[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Array should not be null.");
        }

        // We rely on the fact that sum(1 to N + 1) = (N + 1) * (N + 2) / 2
        int sum = 0;
        for (final int element : array) {
            sum += element;
        }

        final int n = array.length;
        return (n + 1) * (n + 2) / 2 - sum;
    }
}