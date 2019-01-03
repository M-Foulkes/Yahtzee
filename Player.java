import java.util.*;
public class MyProgram
{
    public static String keep;
    public static void main(String[] args)
    {
        
        int turn = 1;
        String kept = "You kept: ";
        Scanner at = new Scanner(System.in);
        int[] dice = MyProgram.getDice();
        //dice[0] = (int)(Math.random()*6 + 1);
        //dice[1] = (int)(Math.random()*6 + 1);
        //dice[2] = (int)(Math.random()*6 + 1);
        //dice[3] = (int)(Math.random()*6 + 1);
        //dice[4] = (int)(Math.random()*6 + 1);
        System.out.print(dice[0]);
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
                    kept += ("Die 1: " + dice[0] + " "); 
                    }
                    //else
                        //Call re-roll
                    if(kr.substring(1,2).equals("K"))
                    {
                        kept += ("Die 2: " + dice[1] + " ");
                    }
                    //else
                        //Call re-roll
                    if(kr.substring(2,3).equals("K"))
                    {
                        kept += ("Die 3: " + dice[2] + " ");
                    }
                    //else
                        //Call re-roll
                    if(kr.substring(3,4).equals("K"))
                    {
                        kept += ("Die 4: " + dice[3] + " ");
                    }
                    //else
                        //Call re-roll
                    if(kr.substring(4,5).equals("K"))
                    {
                        kept += ("Die 5: " + dice[4] + " ");
                    }
                    //else
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
