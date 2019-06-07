package Problem_Solving_Algorithms;

import java.math.BigInteger;

public class ExtraLongFactorials {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger currentValue = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            currentValue = currentValue.multiply(BigInteger.valueOf(i));
        }
        System.out.println(currentValue.toString());
    }
}
