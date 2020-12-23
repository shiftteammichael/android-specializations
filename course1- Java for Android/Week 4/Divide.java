package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    int quotient;
    int remainder;
    String resultString;

    public void divide(int arg1, int arg2){
        try{
            quotient=(arg1/arg2);
            remainder=(arg1%2);

        }catch(ArithmeticException e){
            resultString="Division by zero is not allowed";
        }
    }
    public String getResultString(){
        return resultString;
    }
}
