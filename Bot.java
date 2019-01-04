import java.util.Arrays;

public class Bot
{
    private static DiceArray a = new DiceArray(5);
    private static int dice[];
    private static Upper_Scoreboard s = new Upper_Scoreboard();
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
    private static String c;
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
        ones = s.getValues(dice[], "1");
        twos = s.getValues(dice[], "2");
        threes = s.getValues(dice[], "3");
        fours = s.getValues(dice[], "4");
        fives = s.getValues(dice[], "5");
        sixes = s.getValues(dice[], "6");
        toak = s.getValues(dice[], "A");
        foak = s.getValues(dice[], "B");
        ss = s.getValues(dice[], "C");
        ls = s.getValues(dice[], "D");
        fh = s.getValues(dice[], "E");
        chance = s.getValues(dice[], "F");
        yahtzee = s.getValues(dice[], "G");
        int[] choice = {ones, twos, threes, fours, fives, sixes, toak, foak, s, ls, fh, chance, yahtzee};
        Arrays.sort(choice);
        value = choice[12];
        if (value == ones)
        {
            c = "1";
            name = "Ones";
        }
        if (value == twos)
        {
            c = "2";
            name = "Twos";
        }
        if (value == threes)
        {
            c = "3";
            name = "Threes";
        }
        if (value == fours)
        {
            c = "4";
            name = "Fours";
        }
        if (value == fives)
        {
            c = "5";
            name = "Fives";
        }
        if (value == sixes)
        {
            c = "6";
            name = "Sixes";
        }
        if (value == toak)
        {
            c = "A";
            name = "Three of a Kind";
        }
        if (value == foak)
        {
            c = "B";
            name = "Four of a Kind";
        }
        if (value == ss)
        {
            c = "C";
            name = "Short Straight";
        }
        if (value == ls)
        {
            c = "D";
            name = "Long Straight";
        }
        if (value == fh)
        {
            c = "E";
            name = "Full House";
        }
        if (value == chance)
        {
            c = "F";
            name = "Chance";
        }
        if (value == yahtzee)
        {
            c = "G";
            name = "Yahtzee";
        }
      
        s.setScore(value, false, c);
    }
    
    public String toString()
    {
        
        return "The bot chose " + name + " for " + c + " points";
    }
  
}
