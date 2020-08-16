package problems.codility;

public class FrogRiverOne {

    // A small frog wants to get to the other side of a river. The frog is initially
    // located on one bank of the river (position 0) and wants to get to the opposite
    // bank (position X+1). Leaves fall from a tree onto the surface of the river.
    //
    // You are given an array A consisting of N integers representing the falling leaves.
    // A[K] represents the position where one leaf falls at time K, measured in seconds.
    //
    // The goal is to find the earliest time when the frog can jump to the other side of
    // the river. The frog can cross only when leaves appear at every position across the
    // river from 1 to X (that is, we want to find the earliest moment when all the
    // positions from 1 to X are covered by leaves).
    public static int earliestJumpTime(final int x, final int[] a) {

        if (x < 1) {
            throw new IllegalArgumentException("x should be >= 1");
        }

        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        final boolean[] hasLeaf = new boolean[x];
        int leaves = 0;
        for (int t = 0; t < a.length; t++) {
            final int index = a[t] - 1;
            if (!hasLeaf[index]) {
                if (++leaves == x) {
                    return t;
                }
                hasLeaf[index] = true;
            }
        }

        return -1;
    }
}