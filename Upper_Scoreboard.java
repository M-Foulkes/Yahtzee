import java.util.*;

public class Upper_Scoreboard // extends Dice
{
    Scanner kb = new Scanner(System.in);
    
    /***********************************************************
    
    NOTES:
    -   Write an "setScore" method, which records
        the scores for Players AND Bots
    
    -   Integrate the "Upper_Score" "Lower_Score"
        Class into one "Scoreboard" Class
    
    -   Comment the code THOUROUGHLY, assembling the
        "Scoreboard" Class will be difficult if we
        can't read the code quickly (NOT A PRIORITY)
    
    ***********************************************************/
    
    //Dice dice = new Dice();
    
    String name = "";
    
    public Upper_Scoreboard(String name)
    {
        this.name = name;
    }
    
    //int player[] = { 6*1 ,  6*2 ,   6*3  ,  6*4  ,   6*5  ,  6*6 , 1,  18};
    //int player[] = {ones, twos, threes, fours, fives, sixes, sum, bonus};
    int player[] = new int[8]; 
    boolean playerChoseAlready[] = new boolean[8];
    
    
    int bot[] = new int[8];
    boolean botChoseAlready[] = new boolean[8];
    
    public int getScore(int user[])
    {
        int userTot = 0;
        for(int i = 0; i < user.length - 3; i++)
            userTot += user[i];
        return user[6] = userTot;
    }
    
    public void options(int dice[], boolean user)
    {
        int myChoice;
        String option[] = {"1","2","3","4","5","6"};
        
        if(user)
        {
            System.out.println("\nOptions: \n# - Type (Points)");
            String choices[] = 
                {"1 - ones (" + getValues(dice,"1") + ")",
                 "2 - twos (" + getValues(dice,"2") + ")",
                 "3 - threes (" + getValues(dice,"3") + ")",
                 "4 - fours (" + getValues(dice,"4") + ")",
                 "5 - fives (" + getValues(dice,"5") + ")",
                 "6 - sixes (" + getValues(dice,"6") + ")"};
                 
            //String option[] = {"1","2","3","4","5","6"};
            
            // Display All the Available Options
            for(int i = 0; i < dice.length; i++)
                for(int j = 0; j < option.length; j++)
                    if(dice[i] == j+1 && !playerChoseAlready[j])
                    {
                        playerChoseAlready[j] = true;
                        System.out.println( choices[j] );
                    }
            
            // prompt the user to select an option
            System.out.print("Select your option '#': ");
            myChoice = kb.nextInt() - 1;
            
            setScore(dice, myChoice, option[myChoice], true);
        }
        
        else
        {
            
            // Display All the Available Options
            for(int i = 0; i < dice.length; i++)
                for(int j = 0; j < option.length; j++)
                    if(dice[i] == j+1 && !botChoseAlready[j])
                        botChoseAlready[j] = true;
            
            // prompt the user to select an option
            myChoice = 2;
             
            setScore(dice, myChoice, option[myChoice], false);
        
            //System.out.println();
        }
        
        // CURRENTLY: Prints ALL Options
        System.out.println();
    }
    
    public int getValues(int dice[], String choice)
    {
        String options[] = {"1","2","3","4","5","6"};
        int total = 0;          // Total Counter
        int chosenOption = 0;   // Option initialized
        
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
    
    /************************** "setScore" method (in progress) ************************/
    
    public void setScore( int dice[], int option, String choice, boolean user)
    {
        int score = getValues( dice, choice);
        
        if(user)
            player[option] = score;
        else
        {
            bot[option] = score;
        }
    }
    
    /***********************************************************************************/
    
    public void bonus()
    {
        int playerTot = getScore(player);
        if(playerTot >= 63)
            player[7] = 35;
            
        int botTot = getScore(bot);
        if(botTot >= 63)
            bot[7] = 35;
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
    
    public void print()
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
}
