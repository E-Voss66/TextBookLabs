import java.util.Random;
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    public static void main(String[] args){
        Random dieRoll = new Random();
        
        int roll1, roll2;
        
        roll1 = dieRoll.nextInt(7);
        roll2 = dieRoll.nextInt(7);
        
        System.out.println("Your first roll was a: " + roll1);
        System.out.println("Your second roll was a: " + roll2);
        
        System.out.println("Your total was: " + (roll1 + roll2));
    }
    
}

