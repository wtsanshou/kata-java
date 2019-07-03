package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {

    List<Integer> primeFactorsOf(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();
        
        for (int divider = 2;n > 1;divider++) {
            for (; n % divider == 0; n /= divider)
                factors.add(divider);
        }

        return factors;
    }
}
