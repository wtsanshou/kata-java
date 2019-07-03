package ie.sanshou.kata;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class PrimeFactorsTest {

    @Test
    void factors() {
        PrimeFactors pf = new PrimeFactors();
        assertThat(pf.primeFactorsOf(1), isListOf());
        assertThat(pf.primeFactorsOf(2), isListOf(2));
        assertThat(pf.primeFactorsOf(3), isListOf(3));
    }

    private Matcher<List<Integer>> isListOf(Integer... ints) {
        return is(asList(ints));
    }

}
