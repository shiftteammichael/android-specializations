package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.

        int diff;

        public void  subtract(int arg1, int arg2) {
            diff = arg1 - arg2;
        }

        public String getSubtraction() {
            return String.valueOf(diff);
        }
}
