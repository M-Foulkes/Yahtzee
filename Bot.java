import java.util.Arrays;

public Bot
{
    //private static int MAX_ROLLS = 3;
    //private static int numRolls = 0;
    private static Dice a = new Dice();
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
        dice[] = a.getDice();
    }
    
    //public int keepDice()
    
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
            ups = 1;
        if (value == twos)
            ups = 2;
        if (value == threes)
            ups = 3;
        if (value == fours)
            ups = 4;
        if (value == fives)
            ups = 5;
        if (value == sixes)
            ups = 6;
        if (value == toak)
            downs = "a";
        if (value == foak)
            downs = "b";
        if (value == ss)
            downs = "c";
        if (value == ls)
            downs = "d";
        if (value == fh)
            downs = "e";
        if (value == chance)
            downs = "f";
        if (value == yahtzee)
            downs = "g";
            
        if(downs != null)
            s.setChoice(value, downs);
        else
            s.setChoice(value, ups);
    }
    
    public String toString()
    {
        if(downs != null)
            return "The bot chose " + 
        else
            s.setChoice(value, ups);
    }
    
}
