// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Salary
{
   
   public static void main (String[] args)
   {
           double currentSalary;  // employee's current  salary
           double newSalary = 0;          // new salary for the employee
           double raise = 0;
           String rating;             // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current salary: ");
           currentSalary = scan.nextDouble();
           System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
           rating = scan.next();
 
           // Compute the raise using if ...
           if(rating.equals("Excellent")){
                raise = 0.060;
                
                System.out.println(raise);
            } else if(rating.equals("Good")){
                raise = 0.040;
                System.out.println(raise);
            } else if(rating.equals("Poor")){
                raise = 0.015;
                System.out.println(raise);
            }
            raise = currentSalary * raise;
            
            double total = currentSalary + raise;
            
            newSalary = total;
 
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Current Salary:           " + money.format(currentSalary));
           System.out.println("Amount of your raise: " + money.format(raise));
           System.out.println("Your new salary:          " + money.format(newSalary));
           System.out.println();
        }
       
}
