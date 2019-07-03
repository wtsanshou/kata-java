package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {

    List<Integer> primeFactorsOf(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();
        
        if (n > 1) {
            if (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }
        }
        if (n > 1)
            factors.add(n);

        return factors;
    }
}
