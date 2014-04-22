package application;

import java.math.BigInteger;

public class Calculate {

    public BigInteger factorial() {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= 739; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    
}