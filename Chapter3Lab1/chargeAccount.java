import java.util.Scanner;
/**
 * Write a description of class chargeAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class chargeAccount
{
    public static void main(String[] args){
        double previousBalance;
        double additionalCharges;
        double interest;
        double minimumPayment;
        double newBalance;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Preivious Balance");
        previousBalance = scan.nextDouble();
        System.out.println("Enter how much was spent last month");
        additionalCharges = scan.nextDouble();
        
        interest = calculateInterest(previousBalance);
        newBalance = calculateNewBalance(previousBalance, interest, additionalCharges);
        minimumPayment = calculateMinimumPayment(newBalance);
        
        System.out.println("Your new balance is: " + newBalance);
        System.out.println("Your minimum payment for this month is: " + minimumPayment);
    }
    
    public static double calculateInterest(double previousBalance){
        if(previousBalance > 0){
            return 0.02;
        } else {
            return 0.00;
        }
    }
    
    public static double calculateNewBalance(double previousBalance, double interest, double additionalCharges){
        return previousBalance + additionalCharges + (previousBalance * interest);
    }
    
    public static double calculateMinimumPayment(double newBalance){
        if(newBalance < 50){
            return newBalance;
        } else if (newBalance <= 300) {
            return 50.00;
        } else {
            return newBalance * 0.2;
        }
    }
}
