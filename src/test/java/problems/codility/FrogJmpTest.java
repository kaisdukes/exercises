package problems.codility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.FrogJmp.numberOfJumps;

public class FrogJmpTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCalculateNumberOfJumps() {
        assertThat(numberOfJumps(10, 85, 30), is(equalTo((3))));
        assertThat(numberOfJumps(0, 9, 5), is(equalTo((2))));
        assertThat(numberOfJumps(0, 10, 5), is(equalTo((2))));
        assertThat(numberOfJumps(0, 11, 5), is(equalTo((3))));
        assertThat(numberOfJumps(5, 10, 5), is(equalTo((1))));
        assertThat(numberOfJumps(5, 10, 1), is(equalTo((5))));
    }

    @Test
    public void shouldReturnZeroJumpsIfAlreadyAtTarget() {
        assertThat(numberOfJumps(10, 10, 30), is(equalTo((0))));
    }

    @Test
    public void shouldThrowForNegativeDistance() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("x should be <= y");

        numberOfJumps(11, 10, 30);
    }
}