package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.BinaryGap.longestBinaryGap;

public class BinaryGapTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCalculateLongestBinaryGap() {

        assertThat(longestBinaryGap(0), is(equalTo(0)));
        assertThat(longestBinaryGap(9), is(equalTo(2)));
        assertThat(longestBinaryGap(15), is(equalTo(0)));
        assertThat(longestBinaryGap(20), is(equalTo(1)));
        assertThat(longestBinaryGap(32), is(equalTo(0)));
        assertThat(longestBinaryGap(529), is(equalTo(4)));
        assertThat(longestBinaryGap(1041), is(equalTo(5)));

        assertThat(longestBinaryGap(Integer.MAX_VALUE - 1), is(equalTo(0)));
        assertThat(longestBinaryGap(Integer.MAX_VALUE), is(equalTo(0)));
    }

    @Test
    public void shouldThrowForNegativeInput() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input should be >= 0");

        longestBinaryGap(-1);
    }
}