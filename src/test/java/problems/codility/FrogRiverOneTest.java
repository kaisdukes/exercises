package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.FrogRiverOne.earliestJumpTime;

public class FrogRiverOneTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldGetEarliestJumpTime() {

        assertThat(
                earliestJumpTime(1, new int[]{1}),
                is(equalTo(0)));

        assertThat(
                earliestJumpTime(2, new int[]{1, 1, 1, 2}),
                is(equalTo(3)));

        assertThat(
                earliestJumpTime(2, new int[]{1, 1, 1, 2, 1, 1, 1}),
                is(equalTo(3)));

        assertThat(
                earliestJumpTime(2, new int[]{1, 2}),
                is(equalTo(1)));

        assertThat(
                earliestJumpTime(2, new int[]{1, 1, 1, 1, 1}),
                is(equalTo(-1)));

        assertThat(
                earliestJumpTime(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}),
                is(equalTo(6)));

        assertThat(
                earliestJumpTime(5, new int[]{1, 3, 1, 4, 2, 3, 4, 3}),
                is(equalTo(-1)));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        earliestJumpTime(5, null);
    }

    @Test
    public void shouldThrowForEmptyArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        earliestJumpTime(5, new int[0]);
    }

    @Test
    public void shouldThrowForInvalidRiverSize() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("x should be >= 1");

        earliestJumpTime(0, new int[]{5, 6});
    }
}