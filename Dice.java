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
        die1 = a[0];
        a[1] = roll();
        die2 = a[1];
        a[2] = roll();
        die3 = a[2];
        a[3] = roll();
        die4 = a[3];
        a[4] = roll();
        die5 = a[4];
            
        return a;
    }
}
