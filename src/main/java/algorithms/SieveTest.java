package algorithms;

import java.util.BitSet;

public class SieveTest {

    public static void main(String[] args) {
        int n = 2_000_000;
        long start = System.currentTimeMillis();
        var bitset = new BitSet(n +1);
        int i;

        for (i = 2; i <= n; i++)
            bitset.set(i);
        i = 2;

        while (i * i <= n){
            if (bitset.get(i)){
                int k = i*i;
                while (k <= n){
                    bitset.clear(i);
                    k += i;
                }
            }
            i++;
        }
        long end = System.currentTimeMillis();

        System.out.printf("%s primes\n%s milliseconds", bitset.cardinality(), end - start);
    }
}
