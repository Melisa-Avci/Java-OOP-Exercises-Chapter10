package odev6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximateE {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            System.out.println("i = " + i + " için e değeri: " + getE(i));
        }
    }

    public static BigDecimal getE(int n) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
            BigDecimal term = BigDecimal.ONE.divide(factorial, 25, RoundingMode.HALF_UP);
            e = e.add(term);
        }
        return e;
    }
}
