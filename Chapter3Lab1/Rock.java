// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int result;                     
        
        System.out.println();
        System.out.println("Choose Rock, Paper, or Scissors");
        
        personPlay = getPlayersChoice();
        computerPlay = generateComputerChoice();
        
        System.out.println("Your play is: " + personPlay);
        System.out.println("The computer play is: " + computerPlay);
        
        // If you win, it returns 1, tie it returns 0, lose returns -1
        result = decideWinner(personPlay, computerPlay);
        
        printResult(result);
        
        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        //Print computer's play
        //See who won.
    }
    
    public static String getPlayersChoice(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    
    public static String generateComputerChoice(){
        int computerValue;
        Random generator = new Random();
        
        computerValue = generator.nextInt(3);
        
        if(computerValue == 0){
            return "Rock";
        } 
        else if (computerValue == 1){
            return "Scissors";
        }
        else{
            return "Paper";
        }
        
    }
    
    public static int decideWinner(String player, String computer){
        if(player.equals(computer)){
            return 0;
        } else if(player.equals("Rock") && computer.equals("Scissors") || player.equals("Scissors")
        && computer.equals("Paper") || player.equals("Paper") && computer.equals("Rock")){
            return 1;
        } else{
            return -1;
        }
    }
    
    public static void printResult(int result){
        if(result == 1){
            System.out.println("You Won");
        } else if (result == 0){
            System.out.println("You tied");
        } else{
            System.out.println("You lost");
        }
    }
}
