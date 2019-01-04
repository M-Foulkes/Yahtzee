import java.util.*;

public class DiceArray
{
    
    private int[] dice;
    private boolean[] diceToRoll;
    
     public DiceArray(int numDice)
    {
        dice = new int[numDice];
        diceToRoll = new boolean[numDice];

        for(int i = 0; i < dice.length; i++)
        {   
            dice[i] = -1;
            diceToRoll[i] = true;
        }   
    }
    
    public void theRoll()
    {
        for (int i = 0; i < dice.length; i++)
        {   
            if (diceToRoll[i] == true)
                dice[i] = (int)(Math.random() * 6 + 1);
        }   
    }
    
    public int[] roll()
    {
        return dice;
    }
    
    public void reset()
    {
        for (int i = 0; i < dice.length; i++)
            diceToRoll[i] = true;
    }

}
