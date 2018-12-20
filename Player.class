import java.util.*;
public class MyProgram
{
    public static String keep;
    public static void main(String[] args)
    {
        int turn = 1;
        String kept = "You kept: ";
        Scanner at = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String name = at.nextLine();
        int random = (int)(Math.random() * 2 + 1);
        random = 1;
        if(random == 2)
            System.out.println("It's Bot's turn");
            //Call Bot Class
        else if (random == 1)
        {
            System.out.println("It's " + name + "'s turn");
            while(turn <= 3)
            {
                System.out.println("Heres your roll");
                //Call Dice
                System.out.println("Here is your options");
                
                if(turn < 3)
                {
                    System.out.print("\nWould you like to score with any of these options? (Y/N) ");
                    keep = at.nextLine();
                    keep = keep.toUpperCase();
                    if(keep.equals("N"))
                    {
                        System.out.print("In order of dice choose to Keep or Re-roll (K/R) ");
                        String kr = at.nextLine();
                        kr = kr.toUpperCase();
                        if(kr.substring(0,1).equals("K"))
                        {
                        kept += "Die 1: "; //value
                        }
                        //else
                            //Call re-roll
                        if(kr.substring(1,2).equals("K"))
                        {
                            kept += "Die 2: "; //value
                        }
                        //else
                            //Call re-roll
                        if(kr.substring(2,3).equals("K"))
                        {
                            kept += "Die 3: "; //value
                        }
                        //else
                            //Call re-roll
                        if(kr.substring(3,4).equals("K"))
                        {
                            kept += "Die 4: "; //value
                        }
                        //else
                            //Call re-roll
                        if(kr.substring(4,5).equals("K"))
                        {
                            kept += "Die 5: "; //value
                        }
                        //else
                            //Call re-roll
                        System.out.println(kept);
                        kept = "You Kept: ";
                        turn++;
                        if(turn == 3)
                        {
                            keep = "Y";
                            System.out.println("Heres your roll");
                            //Call Dice
                            System.out.println("Here is your options");
                        }
                        } 
                    }
                    if (keep.equals("Y"))
                    {
                        System.out.print("Which option would you like to keep? ");
                        String opt = at.nextLine();
                        
                        turn = 4;
                    }
                }
            }
    }
}
