package problems.codility;

import static java.lang.System.arraycopy;

public class CyclicRotation {

    // Rotation of the array means that each element is shifted right by one index,
    // and the last element of the array is moved to the first place. The goal is to
    // rotate array A K times; that is, each element of A will be shifted to the right
    // K times.
    public static int[] rotateArray(final int[] array, final int rotationCount) {

        if (array == null) {
            throw new IllegalArgumentException("Array should not be null.");
        }

        if (rotationCount < 0) {
            throw new IllegalArgumentException("Rotation count should be >= 0");
        }

        final int length = array.length;
        final int[] rotated = new int[length];

        if (length > 0) {
            final int offset = rotationCount % length;
            arraycopy(array, 0, rotated, offset, length - offset);
            arraycopy(array, length - offset, rotated, 0, offset);
        }

        return rotated;
    }
}