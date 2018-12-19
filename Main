import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rollNumber = 1;
        boolean hasScored = false;
        
        System.out.println("Enter your name: ");
        //player.setName() = scan.nextLine();
        isBotsTurn();
        
        while(rollNumber < 4 && !hasScored){
            System.out.println("Here is your roll: ");
            dicePrintOut();
    
            System.out.println("Here are your options: ");
            //print scoring options
            
            if(rollNumber != 3){
                System.out.println("Do you want to score with any of these options? (Y/N)");
                /*String answer = ();
                if(answer == 'Y'){
                    hasScored = true;
                    //print score options
                    System.out.println("Select a play: ");
                    //send the play off
                }
                else{
                    System.out.println("dggggg");
                    do you want to keep dice...
                }
                */
            }
            else{
                hasScored = true;
                System.out.println("Select a play: ");
                //send the selected play off
                
            }
            rollNumber++;
        }
        
        //print off the score board
    }
    
    public static void isBotsTurn(){
        int randNum = ((int)(Math.random() * 2) + 1);
        if(randNum == 1){
            System.out.println("It's the Bot's turn.");
            //run the bots turn
            //the bot selected...
        }
        else{
            System.out.println("It's your turn."); // System.out.println("It's your turn, " + player.name()+ ".");
        }
        
    }
    
    public static void dicePrintOut(){
        //for(int i = 1; i <= 6; i++){
            //System.out.println("Dice " + i + ": " + Dice(i).value);
        //}
    }
}
