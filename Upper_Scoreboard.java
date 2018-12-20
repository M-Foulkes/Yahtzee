public class Upper_Scoreboard
{
    String name = "TOMMY BOI";
    int spaces = 10 - name.length();
    
    int player[] = {1,12,13,14,5,16,17,18};
    
    // player[] = {ones, }
     
    int bot[] = new int[8];
    
    /* 
    
    public 
    {
        
    }
    
    */
    public int getScore(int user[])
    {
        int userTot = 0;
        for(int i = 0; i < user.length; i++)
            userTot += user[i];
        return userTot;
    }
    
    public int getValues(int d1, int d2, int d3, int d4, int d5, String choice)
    {
        int dice[] = {d1,d2,d3,d4,d5};
        String options[] = {"1","2","3","4","5","6"};
        int total = 0;
        int chosenOption = 0;
        
        for(int i = 0; i < options.length; i++)
            if( options[i].equals(chosenOption) )
                chosenOption += i + 1;
                
        for(int j = 0; j < 5; j++)
            if(dice[j] == chosenOption)
                total += chosenOption;
                
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
