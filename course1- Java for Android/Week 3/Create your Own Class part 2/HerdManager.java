package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public static final int herd=24;
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
   public void simulateHerd(Random rand){
        int pen=herd;
        int pasture=0;
        int ran=0;
        int gate;
        int East=1;
        mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        for(int i=0; i<MAX_ITERATIONS;i++){
            int direction=0;
            int count=0;
            if (pen == 0) {
                ran = rand.nextInt(pasture)+1;
                count = mWestGate.thru(ran);
                pen += count;
            }
            else if(pasture == 0) {
                ran = rand.nextInt(pen)+1;
                count = mEastGate.thru(ran);
                pen += count;
            }
            else{
                gate = rand.nextInt(2);
                //push them out
                if(gate==East) {
                    ran = rand.nextInt(pen)+1;
                    count+= mEastGate.thru(ran);
                    pen+=count;
                }
                //put them in
                else {
                    ran=rand.nextInt(pasture)+1;
                    count = mEastGate.thru(ran);
                    pen += count;
                }
            }
            pasture = herd - pen;
            mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        }
   }
}
