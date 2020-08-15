package problems.codility;

public class FrogJmp {

    // A small frog wants to get to the other side of the road. The frog is currently located
    // at position X and wants to get to a position greater than or equal to Y. The small frog
    // always jumps a fixed distance, D. Count the minimal number of jumps that the small frog
    // must perform to reach its target.
    public static int numberOfJumps(final int x, final int y, final int d) {

        if (x > y) {
            throw new IllegalArgumentException("x should be <= y");
        }

        final int distance = y - x;
        final int jumps = distance / d;

        return distance % d == 0 ? jumps : jumps + 1;
    }
}