package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.PermMissingElem.findMissingElement;

public class TestPermMissingElem {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldFindMissingElement() {

        assertThat(
                findMissingElement(new int[]{}),
                is(equalTo(1)));

        assertThat(
                findMissingElement(new int[]{1}),
                is(equalTo(2)));

        assertThat(
                findMissingElement(new int[]{2}),
                is(equalTo(1)));

        assertThat(
                findMissingElement(new int[]{1, 3}),
                is(equalTo(2)));

        assertThat(
                findMissingElement(new int[]{1, 2}),
                is(equalTo(3)));

        assertThat(
                findMissingElement(new int[]{3, 2}),
                is(equalTo(1)));

        assertThat(
                findMissingElement(new int[]{2, 3, 1, 5}),
                is(equalTo(4)));
    }

    @Test
    public void shouldFindMissingElementInLargeArray() {

        final int[] array = new int[100000];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i < 78933 ? i : i + 1;
        }

        assertThat(findMissingElement(array), is(equalTo(78933)));
    }

    @Test
    public void shouldThrowWhenArrayIsNull() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null.");

        findMissingElement(null);
    }
}