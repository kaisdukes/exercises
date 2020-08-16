package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.TapeEquilibrium.findMinimalDifference;

public class TapeEquilibriumTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldFindMinimalDifference() {
        assertThat(findMinimalDifference(new int[]{1, 1}), is(equalTo(0)));
        assertThat(findMinimalDifference(new int[]{-1, 1}), is(equalTo(2)));
        assertThat(findMinimalDifference(new int[]{1, 7}), is(equalTo(6)));
        assertThat(findMinimalDifference(new int[]{1, 2, 3}), is(equalTo(0)));
        assertThat(findMinimalDifference(new int[]{-1, -2, -3}), is(equalTo(0)));
        assertThat(findMinimalDifference(new int[]{9, 1, 5}), is(equalTo(3)));
        assertThat(findMinimalDifference(new int[]{9, -6, 5}), is(equalTo(2)));
        assertThat(findMinimalDifference(new int[]{3, 1, 2, 4, 3}), is(equalTo(1)));
        assertThat(findMinimalDifference(new int[]{3, 6, 2, 4, 3}), is(equalTo(0)));
        assertThat(findMinimalDifference(new int[]{-1000, 1000}), is(equalTo(2000)));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        findMinimalDifference(null);
    }

    @Test
    public void shouldThrowForEmptyArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        findMinimalDifference(new int[0]);
    }

    @Test
    public void shouldThrowWhenArrayLengthIsOne() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array length should be >= 2");

        findMinimalDifference(new int[]{7});
    }
}