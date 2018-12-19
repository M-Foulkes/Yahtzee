import java.util.Random;
import java.util.*;

public class MyProgram
{
    
    private int die1;
    private int die2;
    private int die3;
    private int die4;
    private int die5;
    private int a;
    
    public void Dice()
    {
        
    }

    public static int roll()
    {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        return roll;
    }
        
        
    public static int[] getDice()
    {
        int[] a = new int[5];
        a[0] = roll();
        a[1] = roll();
        a[2] = roll();
        a[3] = roll();
        a[4] = roll();
            
        return a;
    }
}
