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
        
        isBotsTurn(name);  //decides between if the bot or player goes first
        
        while(roundNumber < 13){ //counts the number of rounds in the game
            while(rollNumber < 4 && !hasScored){ //counts the number of rolls in the players turn
                System.out.println("Here is your roll: ");
                dicePrintOut();//prints out the dice
        
                System.out.println("Here are your options: ");
                System.out.println(Upper_Scoreboard.options(Dice.getRoll())); //print scoring options
                player.playerTurn();
                
                rollNumber++;
            }
            
            //take the bots turn
            System.out.println(Upper_Scoreboard.options(Dice.getRoll()));//print off the scoreboard
            roundNumber++;
        }
        
        //Upper_Scoreboard.getwinner(); //show who won
    }
    
    public static void isBotsTurn(String name){
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
            System.out.println("Dice " + i + ": " + Dice.getRoll());
        }
    }
}
