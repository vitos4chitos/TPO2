package base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cos {

    public double cos(double x, double delta){
        x = simplification(x);
        double sum = 0;
        int n = 1;
        double step;
        do {
            step = nextTerm(n, x);
            sum += step;
            n++;
        } while (Double.compare(Math.abs(step), delta) >= 0);
        return sum + 1;

    }

    private double nextTerm(int step, double value){
        BigDecimal divider = factorial(step * 2);
        BigDecimal divisible = BigDecimal.valueOf(value).pow(2 * step);
        if(step % 2 != 0){
            divider = divider.negate();
        }
        return divisible.divide(divider, 10, RoundingMode.HALF_UP).doubleValue();
    }

    private BigDecimal factorial(int x){
        BigDecimal value = BigDecimal.valueOf(1);
        for(int i = 1; i <= x; i++) {
            value = value.multiply(BigDecimal.valueOf(i));
        }
        return value;
    }

    private double simplification(double x){
        double k = x;
        while(Double.compare(k, 0) < 0){
            k += Math.PI * 2;
        }
        while (Double.compare(k, Math.PI * 2) > 0){
            k -= Math.PI * 2;
        }
        return k;
    }
}
