package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.MaxCounters.evaluateOperations;

public class MaxCountersTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldEvaluateOperations() {

        assertThat(
                evaluateOperations(1, new int[]{}),
                is(equalTo(new int[]{0})));

        assertThat(
                evaluateOperations(5, new int[]{}),
                is(equalTo(new int[]{0, 0, 0, 0, 0})));

        assertThat(
                evaluateOperations(5, new int[]{3, 4, 4, 6, 1, 4, 4}),
                is(equalTo(new int[]{3, 2, 2, 4, 2})));

        assertThat(
                evaluateOperations(5, new int[]{1, 1, 2, 6, 3, 3, 5}),
                is(equalTo(new int[]{2, 2, 4, 2, 3})));
    }

    @Test
    public void shouldThrowForNullArray() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should not be null.");

        evaluateOperations(5, null);
    }

    @Test
    public void shouldThrowForInvalidCounterSize() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("n should be >= 1");

        evaluateOperations(0, new int[]{5, 6});
    }
}