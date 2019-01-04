import java.util.*;

public class Upper_Scoreboard
{
    /***********************************************************
    
    Methods:

    * public Scoreboard(String name) - initializes a new Scoreboard

    * int getScore(boolean user) - returns the total score of the player or bot
    
    * int getValues(int dice[], String choice) - returns the score a given roll from a given score
    
    * String getWinner() - returns who "Won" based on who has the highest-score
    
    * void options(int dice[], boolean user) - Prompts a Player or Bot to Select a possible score
    
    * void setScore(int dice[], String choice, boolean player) - sets score based off player's or bot's choice
    
    * void print() - Prints a formatted Score-Card
    
    * void bonus() - updates if a player/bot earned the "Bonus"
    
    ***********************************************************/
    
    public static String name = "";
    public Scoreboard(String name)
    {
        this.name = name;
    }
    public static DiceArray myDice = new DiceArray(5);
    public static int dice[] = myDice.roll(5);
    
    /*  public Bot myBot = new Bot();
        public static 
    Bot has no RETURN statement for selecting a score 
    (Would be used in "options" method) */
    
    public static int player[] = new int[15]; 
    public static boolean playerChoseAlready[] = new boolean[15];
    
    public static int bot[] = new int[15];
    public static boolean botChoseAlready[] = new boolean[15];
    
    String options[] = {"1","2","3","4","5","6",
                        "A","B","C","D","E","F","G"};
                        
    Scanner kb = new Scanner(System.in);
    

/**************************** Getter Methods (BEGINNING) ****************************/        
        
    
    public int getValues(int dice[], String choice)
    {
        int total = 0;
        int chosenOption = 0;
        int SpecialScores[] = {
            ThreeOfAKind(dice), FourOfAKind(dice), 
            FullHouse(dice), SmallStraight(dice), 
            LargeStraight(dice), Chance(dice),
            Yahtzee(dice) 
            };
        
        int SpecialOption = Arrays.asList(options).indexOf(choice);
        if(SpecialOption > 6)
            for(int j = 0; j < SpecialScores.length; j++)
                if( (SpecialOption - 6) == j)
                    return SpecialScores[j];

        
        for(int i = 0; i < options.length; i++)  // Relate choice to dice-VALUE
            if( options[i].equals(choice) )
            {
                chosenOption += i + 1;
                break;
            }
                
        for(int j = 0; j < dice.length; j++)  // Add total number of the chosen valued dice
            if(dice[j] == chosenOption)
                total += chosenOption;

        return total;
    }
    
    
    public int getScore(boolean user)
    {
        int total = 0;
        if(user)
        {
            for(int i = 0; i < player.length - 3; i++)
                total += player[i];
            return player[14] = total;
        }
        else
        {
            for(int i = 0; i < bot.length - 3; i++)
                total += bot[i];
            return bot[14] = total;
        }
    }
    
    
    public String getWinner()
    {
        int playerTot = 0;
        int botTot = 0;
        
        for(int i = 0; i < player.length; i++)
        {
            playerTot += player[i];
            botTot += bot[i];
        }
        
        if(playerTot > botTot)
            return name;
        else if(playerTot < botTot)
            return "bot";
        else
            return "tie";
    }
    
 
/******************************* Getter Methods (END) *********************************/
 

/***************************** Setter Methods (BEGINNING) *****************************/ 
  
    public void options(int dice[], boolean user)
    {
        int myChoice;
        
        if(user)
        {
            System.out.println("\nOptions: \n# - Type (Points)");
            String choices[] = 
                {"1 -       Ones        (" + getValues(dice,"1") + ")",
                 "2 -       Twos        (" + getValues(dice,"2") + ")",
                 "3 -       Threes      (" + getValues(dice,"3") + ")",
                 "4 -       Fours       (" + getValues(dice,"4") + ")",
                 "5 -       Fives       (" + getValues(dice,"5") + ")",
                 "6 -       Sixes       (" + getValues(dice,"6") + ")",
                 "A -  Three of a Kind  (" + getValues(dice,"A") + ")",
                 "B -   Four of a Kind  (" + getValues(dice,"B") + ")",
                 "C -   Small Straight  (" + getValues(dice,"C") + ")",
                 "D -   Large Straight  (" + getValues(dice,"D") + ")",
                 "E -    Full House     (" + getValues(dice,"E") + ")",
                 "F -       Chance      (" + getValues(dice,"F") + ")",
                 "G -       Yahtzee      (" + getValues(dice,"G") + ")"};
                 
                 
            for(int i = 0; i < dice.length; i++)
                for(int j = 0; j < options.length; j++)
                    if(dice[i] == j+1 && !playerChoseAlready[j])
                    {
                        playerChoseAlready[j] = true;
                        System.out.println( choices[j] );
                    }
            
            System.out.print("Select your option '#': ");
            myChoice = kb.nextInt() - 1;
            
            setScore(dice, options[myChoice], true);
        }
        
        else
        {
            for(int i = 0; i < dice.length; i++)
                for(int j = 0; j < options.length; j++)
                    if(dice[i] == j+1 && !botChoseAlready[j])
                        botChoseAlready[j] = true;
            
            myChoice = 11; // "Chance" - index
            // myChoice = myBot.highestChoice(); // Get Choice from Bot (Import "Bot" Class)
            
            setScore(dice, options[myChoice], false);
        }
        
        System.out.println();
    }
    
    
    public void setScore( int dice[], String choice, boolean user)
    {
        int option = Arrays.asList(options).indexOf(choice);
        
        int score = getValues( dice, choice);
        
        if(user)
            player[option] = score;
        else
            bot[option] = score;
    }
    
    public static  void bonus()
    {
        int playerTot = 0;
        int botTot = 0;
        for(int i = 0; i < 6; i++)
        {
            playerTot += player[i];
            botTot += bot[i];
        }
        if(playerTot >= 63)
            player[7] = 35;

        if(botTot >= 63)
            bot[7] = 35;
    }
    
    
    public static void print()
    {
        int spaces = 10 - name.length();
        
        for(int i = 0; i < spaces; i++)
             System.out.print(" ");
        
        System.out.println("    " + name + "  |  " + "Bot");
        
        String nums [] = {"One:       ", "Two:       ", "Three:     ", "Four:      ",
                          "Five:      ", "Six:       ", "Sum:       ", "Bonus:     "};
        
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
            if(player[i] != 0)
                if(player[i] >= 10)    
                    System.out.print("" + player[i]  + "  |  ");
                else   
                    System.out.print(" " + player[i]  + "  |  ");
            else
                System.out.print(" /  |  ");
            if(bot[i] != 0)
                System.out.println(bot[i]);
            else
                System.out.print("/\n");
        }
        System.out.println();
    }
    
  
/******************************* Setter Methods (END) *********************************/

    
/*********************** Special Score Methods (BEGINNING) ****************************/

    
    public int ThreeOfAKind(int[] dice) 
    {
        int theRoll = 0;
        int num[] = new int[5];
        
        for(int i = 0; i < 5; i++) // Goes through each dice
            for(int j = 0; j < 6; j++) // Goes through each possible roll per dice
                if(dice[i] == (j + 1))
                    num[i] += 1;
                    
        for(int m = 0; m < 5; m++) // Goes through each recorded roll
                if(num[m] <= 3)
                    theRoll += num[m];
        
        return theRoll * 3;
    }
    
    public int Chance(int dice[])
    {
        int score = 0;
        for(int i = 0; i < 5; i++)
            score += dice[i];
        return score;
    }
    
    public int FourOfAKind(int[] dice) 
    {
        int theRoll = 0;
        int num[] = new int[5];
        
        for(int i = 0; i < 5; i++) // Goes through each dice
            for(int j = 0; j < 6; j++) // Goes through each possible roll per dice
                if(dice[i] == (j+1))
                    num[j - 1] += 1;
                    
        for(int m = 0; m < 5; m++) // Goes through each recorded roll
                if(num[m] < 3)
                    theRoll += num[m];
        
        return theRoll * 4;
    }
    
    public int FullHouse(int[] dice) {
        
        int num[] = new int[6];
        
        for(int i = 0; i < 5; i++) // Goes through each dice
            for(int j = 0; j < 6; j++) // Goes through each possible roll per dice
                if(dice[i] == (j+1))
                    num[j] += 1;
        boolean two = false,
                three = false;
        for(int m = 0; m < 6; m++)
            if(num[m] == 2)
                two = true;
            else if(num[m] == 3)
                three = true;

        if(two && three)
            return 25;
        return 0;
    }
    
    public int SmallStraight(int[] dice){
        boolean check = false;
        for (int i = 0; i < 5; i++)
        {
            if (dice[i] == 1 && dice[i+1] == 2 && dice[i+2] == 3 && dice[i+3] == 4)
                check = true;
            else if (dice[i] == 2 && dice[i+1] == 3 && dice[i+2] == 4 && dice[i+3] == 5)
                check = true;                
        }
        if(check)
            return 30;
        return 0;
    }
    
    public int LargeStraight(int[] dice){
        boolean check = false;
        for (int i = 0; i < 5; i++)
        {
            if (dice[i] == 1 && dice[i+1] == 2 && dice[i+2] == 3 && dice[i+3] == 4 && dice[i+4] == 5)
                check = true;               
        }
        if(check)
            return 40;
        return 0;
    }

    public int Yahtzee(int[] dice)
    {
        int num[] = new int[5];
        
        for(int i = 0; i < 5; i++)
            for(int j = 1; j < 7; j++)
                if(j == dice[i])
                    num[i] += 1;

        for(int j = 0; j < 5; j++)
            if(num[j] == 5)
                return 50;
        return 0;
    }
    
    
    /****************** Special Score Methods (BEGINNING) *********************************/   
}
