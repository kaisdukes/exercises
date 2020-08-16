package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.PermCheck.isPermutation;

public class PermCheckTest {
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCheckPermutation() {
        assertThat(isPermutation(new int[]{1}), is(equalTo(true)));
        assertThat(isPermutation(new int[]{2, 1}), is(equalTo(true)));
        assertThat(isPermutation(new int[]{1, 3}), is(equalTo(false)));
        assertThat(isPermutation(new int[]{1, 1, 1}), is(equalTo(false)));
        assertThat(isPermutation(new int[]{3, 3, 3}), is(equalTo(false)));
        assertThat(isPermutation(new int[]{3, 1, 2}), is(equalTo(true)));
        assertThat(isPermutation(new int[]{4, 1, 3}), is(equalTo(false)));
        assertThat(isPermutation(new int[]{4, 1, 3, 2}), is(equalTo(true)));
        assertThat(isPermutation(new int[]{6, 4, 3, 5, 2, 1}), is(equalTo(true)));
        assertThat(isPermutation(new int[]{6, 4, 6, 6, 2, 1}), is(equalTo(false)));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        isPermutation(null);
    }

    @Test
    public void shouldThrowForEmptyArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        isPermutation(new int[0]);
    }
}