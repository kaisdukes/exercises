package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.MissingInteger.findMissingInteger;

public class MissingIntegerTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldFindMissingInteger() {
        assertThat(findMissingInteger(new int[]{1, 2, 3}), is(equalTo(4)));
        assertThat(findMissingInteger(new int[]{-1, -3}), is(equalTo(1)));
        assertThat(findMissingInteger(new int[]{1, 2, 3, 4, 7}), is(equalTo(5)));
        assertThat(findMissingInteger(new int[]{1, 2, 3, 4, 5, 6, 7}), is(equalTo(8)));
        assertThat(findMissingInteger(new int[]{1}), is(equalTo(2)));
        assertThat(findMissingInteger(new int[]{0}), is(equalTo(1)));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        findMissingInteger(null);
    }

    @Test
    public void shouldThrowForEmptyArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        findMissingInteger(new int[0]);
    }
}