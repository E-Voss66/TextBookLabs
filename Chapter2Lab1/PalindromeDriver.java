
/**
 * Write a description of class PalindromeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeDriver
{
    public static void main(String[] args){
        Palindrome pablo = new Palindrome("aagoboogaaagoboogaa");
        
        System.out.println("The word is: " + pablo.word);
        System.out.println("Palindrome: " + pablo.test());
    }
}
