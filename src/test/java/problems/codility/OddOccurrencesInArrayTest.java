package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.OddOccurrencesInArray.oddOccurrenceInArray;

public class OddOccurrencesInArrayTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldGetOddOccurrence() {

        assertThat(
                oddOccurrenceInArray(new int[]{9, 3, 9, 3, 9, 7, 9}),
                is(equalTo(7)));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        oddOccurrenceInArray(null);
    }

    @Test
    public void shouldThrowForEmptyArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null or empty.");

        oddOccurrenceInArray(new int[0]);
    }

    @Test
    public void shouldThrowForArrayWithoutOddOccurrence() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(
                "Array does not contain an element that occurs an odd number of times.");

        oddOccurrenceInArray(new int[]{9, 3, 9, 3, 9, 7, 7, 9});
    }
}