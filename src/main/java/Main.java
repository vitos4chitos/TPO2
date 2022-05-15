import base.Cos;
import base.Ln;
import base.Sin;
import complexFunctions.Cot;
import complexFunctions.Csc;
import complexFunctions.LogN;
import mainFunction.MainFunction;

public class Main {

    public static void main(String[] args) {
        Cos cos = new Cos();
        Sin sin = new Sin();
        Cot cot = new Cot(new Sin(), new Cos());

        LogN logN = new LogN(new Ln());
        System.out.println(logN.logN(94, 3, 0.0001));
    }
}
