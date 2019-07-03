package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class PrimeFactors {

    List<Integer> primeFactorsOf(int n) {
        final ArrayList<Integer> factors = new ArrayList<>();

        if (n > 1) {
            for (;n % 2 == 0;n /= 2) 
                factors.add(2);
            for (;n % 3 == 0;n /= 3)
                factors.add(3);
        }
        if (n > 1)
            factors.add(n);

        return factors;
    }
}
