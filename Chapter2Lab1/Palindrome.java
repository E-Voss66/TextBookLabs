
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public String word;
    private String backwardsWord = "";
    private boolean isPalindrome;
    
    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome(String wd)
    {
        this.word = wd;
    }
    
    public boolean test() {
        // Detiermine if word is a palindrome
        for(int i = word.length()-1; i > -1 ; i --){
            backwardsWord += word.substring(i,i+1);
        }
        System.out.println(backwardsWord);
        if(word.equals(backwardsWord)){
            isPalindrome = true;
        }
        // Set is Palindrome
        return isPalindrome;
    }

}
