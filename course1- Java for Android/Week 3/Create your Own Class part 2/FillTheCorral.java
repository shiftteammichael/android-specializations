package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gates,Random rand){
        for(int i=0;i<gates.length;i++){
            if(rand.nextInt(2)-1==1){
                gates[i].open(Gate.IN);
            }
            else{
                gates[i].open(Gate.OUT);
            }
            mOut.println("Gate+ "+gates[i].toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for(int i=0; i<corral.length;i++){
            if (corral[i].getSwingDirection() == Gate.IN) {
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand) {
        int pasture = 5;
        int attempts = 0;
        int randomNumber=0;
        int randomGate=0;
        while(pasture > 0) {
            randomGate=rand.nextInt(corral.length);
            randomNumber=rand.nextInt(pasture)+1;
            mOut.println(randomNumber + " are trying to move through coral " + randomGate);
            int snail = rand.nextInt(pasture);
        }
        mOut.println("It took " + attempts + " attempts to coral all of the snails.");
        return attempts;
    }


}
