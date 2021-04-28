
package tosinRepo;
import java.math.*;
public class PrimeNumber {

    public static String numPrimorial(int n) {
        BigInteger prime = new BigInteger("2");
        BigInteger i = new BigInteger("1");
        for (int j = 0; j < n; j++) {
            i = i.multiply(prime);
            prime = prime.nextProbablePrime();
        }
        return i.toString();
    }

}
