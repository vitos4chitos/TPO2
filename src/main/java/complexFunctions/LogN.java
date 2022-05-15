package complexFunctions;

import base.Ln;

public class LogN {
    private final Ln ln;

    public LogN(Ln ln){
        this.ln = ln;
    }

    public double logN(double x, double n, double delta){
    System.out.println(x + " " + n + " " + delta);
        return ln.ln(x, delta)/ln.ln(n, delta);
    }
}
