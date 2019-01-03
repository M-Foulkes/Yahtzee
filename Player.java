import java.util.*;
public class Player
{
public static String keep;
public static void playerTurn()
{
    int turn = 1;
    String kept = "You kept: ";
    int[] dice = new int[5];
    dice[0] =
    dice[1] =
    dice[2] =
    dice[3] =
    dice[4] =
    Scanner at = new Scanner(System.in);
    while(turn <= 3)
    {
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
                else
                    //Call re-roll
                if(kr.substring(1,2).equals("K"))
                {
                    kept += "Die 2: "; //value
                }
                else
                    //Call re-roll
                if(kr.substring(2,3).equals("K"))
                {
                    kept += "Die 3: "; //value
                }
                else
                    //Call re-roll
                if(kr.substring(3,4).equals("K"))
                {
                    kept += "Die 4: "; //value
                }
                else
                    //Call re-roll
                if(kr.substring(4,5).equals("K"))
                {
                    kept += "Die 5: "; //value
                }
                else
                    //Call re-roll
                System.out.println(kept);
                kept = "You Kept: ";
                turn++;
                if(turn == 3)
                {
                    keep = "Y";
                    //System.out.println("Here is your roll");
                    //getDice();
                    //System.out.println("Here is your options");
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
