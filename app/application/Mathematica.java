package application;

import java.math.BigInteger;

public class Mathematica {

    private static final int RUNNING_PROCESSES = 2;
    private static boolean[] running = new boolean[RUNNING_PROCESSES];
    private static ArrayList<MathCommand> commands = new ArrayList<MathCommand>();

    /**
     * Calculates a mathematica command.
     */
    public String math(String cmd) {
        MathCommand mathCommand = new MathCommand(cmd);
        commands.add(mathCommand);
        while(!mathCommand.isResponded()); // very stupid but lets wait.
        mathCommand.getResponse();
    }
 
    public BigInteger factorial() {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= 739; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    
    private void linkAvailable() {
        
    }
    
}