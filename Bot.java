public Bot
{
    //private static int MAX_ROLLS = 3;
    //private static int numRolls = 0;
    private static Dice a = new Dice();
    private static int dice[] = new int[5];
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
    private static int value;
    
        
    public Bot()
    {
       
    }
    
    public void botRoll()
    {
        //while (numRolls < MAX_ROLLS)
        for (int i = 0; i < dice.length; i++)
        {
            dice[i] = a.rollDice();
        }

    }
    
    //public int keepDice()
    
    public String highestChoice()
    {
        ones = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], 1);
        twos = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], 2);
        threes = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], 3);
        fours = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], 4);
        fives = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], 5);
        sixes = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4],  6);
        toak = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], a);
        foak = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], b);
        ss = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], c);
        ls = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], d);
        fh = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], e);
        chance = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], f);
        yahtzee = s.getValues(dice[0], dice[1], dice[2], dice[3], dice[4], g);
        
        
        
    }
    
    public int getValue()
    {
        return value;
    }
    
    

}
