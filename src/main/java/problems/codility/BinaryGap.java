package problems.codility;

public class BinaryGap {

    // A binary gap within a positive integer N is any maximal sequence of consecutive zeros
    // that is surrounded by ones at both ends in the binary representation of N.
    public static int longestBinaryGap(final int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input should be >= 0");
        }

        int currentLength = -1; // length of current sequence
        int maximumLength = 0; // the maximum gap length so far
        int remainder = n;

        while (remainder > 0) {

            // check the rightmost bit
            if ((remainder & 1) == 1) {
                if (currentLength > maximumLength) {
                    maximumLength = currentLength;
                }
                currentLength = 0;
            } else if (currentLength >= 0) {
                currentLength++;
            }

            remainder >>= 1;
        }

        return maximumLength;
    }
}