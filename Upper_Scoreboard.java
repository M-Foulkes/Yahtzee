public class Upper_Scoreboard
{
    String name = "LP";
    int spaces = 10 - name.length();
    
    int player[] = {  1 ,  12 ,   13  ,  14  ,   5  ,  16  , 17 ,  18  };
    
    //  player[] = {ones, twos, threes, fours, fives, sixes, sum, bonus}
    // int player[] = new int[8]; 
    int bot[] = new int[8];
    
    public int getScore(int user[])
    {
        int userTot = 0;
        for(int i = 0; i < user.length; i++)
            userTot += user[i];
        return userTot;
    }
    
    public String options(int dice[])
    {
        System.out.println("Options: ");
        int options[] = {1,2,3,4,5,6};
        return "";
        
        // PRINT OUT THE AVAILABLE OPTIONS
    }
    
    public int getValues(int dice[], boolean user, String choice)
    {
        String options[] = {"1","2","3","4","5","6"};
        int total = 0;          // Total Counter
        int chosenOption = 0;   // Option initialized
        
        for(int i = 0; i < options.length; i++)  // Relate choice to dice-VALUE
            if( options[i].equals(choice) )
                chosenOption += i + 1;
                
        for(int j = 0; j < dice.length; j++)  // Add total number of the chosen valued dice
            if(dice[j] == chosenOption)
                total += chosenOption;
        
        chosenOption -= 1; // sets back the index to 'MATCH' the scoreboard 
        
        if(!user)
            bot[chosenOption] = total;
        else
            player[chosenOption] = total;
        
        return total;
    }
    
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
                    System.out.print(player[i]  + "  |  ");
                else   
                    System.out.print(" " + player[i]  + "  |  ");
            else
                System.out.print("/   |  ");
            if(bot[i] != 0)
                System.out.print(bot[i]);
            else
                System.out.print("/\n");
        }
    }
}



