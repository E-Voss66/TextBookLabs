package Problem2;

//***********************************************************
// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.  
//***********************************************************
import java.util.Scanner;
public class TestAccounts1
{
    public static void main(String[] args)
    {
        Account bob = new Account(100.00, "Bob", 1234);
        Account jon = new Account(100.00, "Jon", 1235);
        Account tim = new Account(100.00, "Tim", 1236);
        
        System.out.println(bob);
        System.out.println(jon);
        System.out.println(tim);
        
        bob.close();
        
        Account jim = Account.consolidate(jon, tim);
        
        System.out.println(bob);
        System.out.println(jon);
        System.out.println(tim);
        System.out.println(jim);
            
    }
}