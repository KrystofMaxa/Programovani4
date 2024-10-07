import java.math.BigInteger;

public class UkolA {
    public void metodaA(int n) {
        BigInteger i = BigInteger.valueOf(n);

        while(i.compareTo(BigInteger.ONE) > 0) {
            if (i.isProbablePrime(1)) {
                UkolB b = new UkolB(n);
            }
            i = i.subtract(BigInteger.ONE);
        }

        Jedinacek jedinacek = Jedinacek.getInstance();
        jedinacek.counter++;
    }
}
