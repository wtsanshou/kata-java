package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {

    List<Integer> primeFactorsOf(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();
        if (n > 1)
            factors.add(2);
        return factors;
    }
}
