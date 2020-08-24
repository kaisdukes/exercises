package problems.codility;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static problems.codility.CountDiv.countDiv;

public class CountDivTest {

    @Test
    public void shouldCountNumberOfIntegersDivisibleByK() {
        assertThat(countDiv(6, 11, 2), is(equalTo((3))));
        assertThat(countDiv(463, 789, 100), is(equalTo((3))));
        assertThat(countDiv(5, 10, 1), is(equalTo((6))));
        assertThat(countDiv(6, 11, 10), is(equalTo((1))));
        assertThat(countDiv(6, 9, 10), is(equalTo((0))));
        assertThat(countDiv(6, 49, 10), is(equalTo((4))));
        assertThat(countDiv(50, 60, 2), is(equalTo((6))));
        assertThat(countDiv(33, 33, 33), is(equalTo((1))));
        assertThat(countDiv(100000, 1000000, 1000), is(equalTo((901))));
    }
}