package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.\
    int multiplyR;

    public void multiply(int arg1, int arg2) {
        multiplyR = arg1 * arg2;
    }

    public String getmultiplication() {
        return String.valueOf(multiplyR);
    }
}
