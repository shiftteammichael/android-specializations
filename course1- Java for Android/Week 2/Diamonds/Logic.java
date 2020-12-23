package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        // TODO -- add your code here

        // This code is used to print the top of the diamond
        printTopOrBottom(size);
        printTopOfDiamond(size);
        printMiddle(size);
        printBottomOfDiamond(size);
        printTopOrBottom(size);

    }

    // TODO -- add your code here
    // This method prints the middle of the diamond
    public void printMiddle(int size){
        mOut.print("\n");
        mOut.print("|");
        mOut.print("<");
        for(int j=0;j<2*(size-1);j++)
        {
            if(size%2==0)
                mOut.print("-");
            else
                mOut.print("=");
        }
        mOut.print(">");
        mOut.print("|");
    }
    // This method prints the bottom half of the diamond
    public void printBottomOfDiamond(int size){
        for(int i=1;i<size;i++) {
            mOut.print("\n");
            mOut.print("|");
            spaces(size,i);
            mOut.print("\\");
           checkIfBottomTop(size,i);
            mOut.print("/");
            for (int l = 1; l <= i; l++)
                mOut.print(" ");
            mOut.print("|");
        }
        mOut.print("\n");
    }
    // This method prints the upper half of the diamond using the other helper method
    public void printTopOfDiamond(int size){
        for(int i=1;i<size;i++)
        {
            mOut.print("\n");
            mOut.print("|");
            spaces(size,i);
            mOut.print("/");
            checkIfDoubleTOP(i);
            mOut.print("\\");
            spaces(size,i);
            mOut.print("|");
        }
    }
    // This helper method prints the lines between the top and bottom of the triangle
    public void printTopOrBottom(int count){
        mOut.print("+");
        for(int i=1;i<=2*count;i++)
            mOut.print("-");
        mOut.print("+");

    }
    // This method prints the spaces between in the top and bottom of the triangle
    public void spaces(int n,int i )
    {
        for(int j=1;j<=n-i;j++)
            mOut.print(" ");
    }
    // This method is a helper method of creating the top of diamond and checks if its a dash or equal
    public void checkIfDoubleTOP(int i){
        for(int k=1;k<=(2*(i-1));k++)
        {
            if(i%2==0)
                mOut.print("-");
            else
                mOut.print("=");
        }
    }
    //This method is a helper method that checks if its a dash or equals sign
    public void checkIfBottomTop(int size,int i){
        for (int k = 1; k <= (2 * (size - i - 1)); k++) {
            if (i % 2 == 0)
                mOut.print("-");
            else
                mOut.print("=");
        }
    }
}


