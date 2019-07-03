package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {

    List<Integer> primeFactorsOf(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();

        int divider = 2;
        while (n > 1) {
            for (; n % divider == 0; n /= divider)
                factors.add(divider);
            divider++;
        }

        return factors;
    }
}
