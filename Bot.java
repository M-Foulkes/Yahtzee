import java.util.Arrays;

public class Bot
{
    private static DiceArray a = new DiceArray(5);
    private static int dice[];
    private static Scoreboard s = new Scoreboard();
    private static int ones;
    private static int twos;
    private static int threes;
    private static int fours;
    private static int fives;
    private static int sixes;
    private static int toak;
    private static int foak;
    private static int ss;
    private static int ls;
    private static int fh;
    private static int chance;
    private static int yahtzee;
    private static String downs;
    private static int ups;
    private static int value;
    private static String name;
    
        
    public Bot()
    {
       
    }
    
    public void botRoll()
    {
        dice[] = a.roll();
    }
    
    public void highestChoice()
    {
        ones = s.getValues(dice[], 1);
        twos = s.getValues(dice[], 2);
        threes = s.getValues(dice[], 3);
        fours = s.getValues(dice[], 4);
        fives = s.getValues(dice[], 5);
        sixes = s.getValues(dice[],  6);
        toak = s.getValues(dice[], a);
        foak = s.getValues(dice[], b);
        ss = s.getValues(dice[], c);
        ls = s.getValues(dice[], d);
        fh = s.getValues(dice[], e);
        chance = s.getValues(dice[], f);
        yahtzee = s.getValues(dice[], g);
        int[] choice = {ones, twos, threes, fours, fives, sixes, toak, foak, s, ls, fh, chance, yahtzee};
        Arrays.sort(choice);
        value = choice[12];
        if (value == ones)
        {
            ups = 1;
            name = "Ones";
        }
        if (value == twos)
        {
            ups = 2;
            name = "Twos";
        }
        if (value == threes)
        {
            ups = 3;
            name = "Threes";
        }
        if (value == fours)
        {
            ups = 4;
            name = "Fours";
        }
        if (value == fives)
        {
            ups = 5;
            name = "Fives";
        }
        if (value == sixes)
        {
            ups = 6;
            name = "Sixes";
        }
        if (value == toak)
        {
            downs = "a";
            name = "Three of a Kind";
        }
        if (value == foak)
        {
            downs = "b";
            name = "Four of a Kind";
        }
        if (value == ss)
        {
            downs = "c";
            name = "Short Straight";
        }
        if (value == ls)
        {
            downs = "d";
            name = "Long Straight";
        }
        if (value == fh)
        {
            downs = "e";
            name = "Full House";
        }
        if (value == chance)
        {
            downs = "f";
            name = "Chance";
        }
        if (value == yahtzee)
        {
            downs = "g";
            name = "Yahtzee";
        }
            
        if(downs != null)
        {
            s.setScore(value, false, downs);
        }
        else
        {
            s.setScore(value, false, ups);
        }
    }
    
    public String toString()
    {
        if(downs != null)
            return "The bot chose " + name + " for " + downs + " points";
        else
            return "The bot chose " + name + " for " + ups + " points";
    }
  
}
