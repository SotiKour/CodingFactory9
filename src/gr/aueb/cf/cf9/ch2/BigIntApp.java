package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;
/*
* BigInteger App demo
 */

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("1234567894563212");
        BigInteger bigNum2 = new BigInteger("465489143524649687454");
        BigInteger bigResult;

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("Result: %,d%n", bigResult);

    }
}
