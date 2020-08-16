package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.CyclicRotation.rotateArray;

public class CyclicRotationTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldRotateArray() {

        assertThat(
                rotateArray(new int[0], 3),
                is(equalTo(new int[0])));

        assertThat(
                rotateArray(new int[]{3, 8, 9, 7, 6}, 0),
                is(equalTo(new int[]{3, 8, 9, 7, 6})));

        assertThat(
                rotateArray(new int[]{3, 8, 9, 7, 6}, 3),
                is(equalTo(new int[]{9, 7, 6, 3, 8})));

        assertThat(
                rotateArray(new int[]{3, 8, 9, 7, 6}, 97),
                is(equalTo(new int[]{7, 6, 3, 8, 9})));

        assertThat(
                rotateArray(new int[]{0, 0, 0}, 1),
                is(equalTo(new int[]{0, 0, 0})));

        assertThat(
                rotateArray(new int[]{1, 2, 3, 4}, 4),
                is(equalTo(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void shouldThrowForNegativeRotationCount() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Rotation count should be >= 0");

        rotateArray(new int[]{1, 2, 3}, -1);
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null.");

        rotateArray(null, 5);
    }
}