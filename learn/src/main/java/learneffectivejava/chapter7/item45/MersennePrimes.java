package learneffectivejava.chapter7.item45;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.TWO;

/**
 * Create by peng on 2020/9/7.
 */
public class MersennePrimes {
    static Stream<BigInteger> primes(){
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void main(String[] args){
        primes().map(p -> TWO.pow())
    }

}
