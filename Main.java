import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rollNumber = 1;               //how many rolls you had in a round
        int roundNumber = 0;              //how many rounds you had in total in a game
        boolean hasScored = false;        //have you selected to score in a round before 3 rolls
        String name = "";
        
        
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        
        isBotsTurn(); //decides between if the bot or player goes first
        
        while(roundNumber < 13){ //counts the number of rounds in the game
            while(rollNumber < 4 && !hasScored){ //counts the number of rolls in the players turn
                System.out.println("Here is your roll: ");
                dicePrintOut();//prints out the dice
        
                System.out.println("Here are your options: ");
                System.out.println(Upper_Scoreboard.options(Dice.getRoll())); //print scoring options
                
                if(rollNumber != 3){
                    System.out.println("Do you want to score with any of these options? (Y/N)");
                    String response = scan.nextLine();
                    if(response.equals("Y")){
                        hasScored = true;
                        System.out.println(Upper_Scoreboard.options(Dice.getRoll())); //print scoring options
                        System.out.println("Select a play: ");
                    }
                    else{
                        System.out.println("Do you want to keep any dice? (Y/N)");
                        response = scan.nextLine();
                        if(response.equals("Y")){
                            System.out.println("Which dice would you like to keep? ");
                            response = scan.nextLine();
                            System.out.println("You kept dice " + response);
                            //send off which dice we kept
                        }
                        else{
                            System.out.println("You kept no die");
                        }
                        
                    }
                }
                else{
                    hasScored = true;
                    System.out.println("Select a play: ");
                    //send the selected play off
                    
                }
                rollNumber++;
            }
            
            //take the bots turn
            //print off the scoreboard
            roundNumber++;
        }
        
        Upper_Scoreboard.getwinner(); //show who won
    }
    
    public static void isBotsTurn(){
        int randNum = ((int)(Math.random() * 2) + 1);
        if(randNum == 1){
            System.out.println("It's the Bot's turn.");
            //run the bots turn
            //the bot selected...
        }
        else{
            System.out.println("It's your turn, " + name + ".");
        }
        
    }
    
    public static void dicePrintOut(){
        for(int i = 0; i < 6; i++){
            System.out.println("Dice " + i + ": " + getRoll());
        }
    }
}
