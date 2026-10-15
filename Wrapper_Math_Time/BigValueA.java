// Program to store huge numbers

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigValueA {
    public static void main(String[] args) {

        // BigInteger stores very large integers
        BigInteger bigI = new BigInteger("7984787598347598437953329");
        System.out.println(bigI);

        // BigDecimal stores large decimal values precisely
        BigDecimal bigD = new BigDecimal("47534759834.98435783465874687648754876");
        System.out.println(bigD);

    }//main
}//class