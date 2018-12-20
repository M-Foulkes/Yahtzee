public class Upper_Scoreboard
{
    public void print()
    {
        String name = "Lukas";
        
        int spaces = 10 - name.length();
        for(int i = 0; i < spaces; i++)
             System.out.print(" ");
        
        System.out.println("    " + name + "  |  " + "Bot");
        
        String nums [] = {"One:       ", "Two:       ", "Three:     ", "Four:      ",
                          "Five:      ", "Six:       ", "Sum:       ", "Bonus:     "};
        int player[] = {1,12,13,14,5,16,17,18};
        int bot[] = new int[8];
        
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
