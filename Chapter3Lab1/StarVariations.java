import java.util.Scanner;
/**
 * Write a description of class StarVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarVariations
{
    
    public static void main(String[] agrs){
        createA();
        createB();
        createC();
    }
    
    public static void createA(){
        Scanner scanA = new Scanner(System.in);
        int longestLine;
        
        System.out.println("Enter how long you want the pattern");
        longestLine = scanA.nextInt();
        
        while(longestLine > 0){
            for(int i = longestLine; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            longestLine -= 1;
        }
    }
    
    public static void createB(){
        Scanner scanB = new Scanner(System.in);
        int longestLine;
        int currentLine = 1;
        
        System.out.println("Enter how long you want the pattern");
        longestLine = scanB.nextInt();
        
        for( int i = longestLine; i > 0; i--){
            printCharacter(" ", i - 1);
            printCharacter("*", currentLine);
            System.out.println();
            currentLine += 1;
        }
        
    }
    
    public static void printCharacter(String character, int repeat){
        for( int i = repeat; i > 0; i--){
            System.out.print(character);
        }
    }
    
    public static void createC(){
        Scanner scanC = new Scanner(System.in);
        int longestLine;
        int currentLine = 0;
        boolean x = true;
        
        System.out.println("Enter how long you want you want the pattern");
        longestLine = scanC.nextInt();
        
        // way too complicated version of what I did in the problem before
        while(currentLine < longestLine){
            for(int i = currentLine; i < longestLine; i++){
                while(x){
                    for(int j = 0; j < currentLine; j++){
                        System.out.print(" ");
                    }
                    x = false;
                }
                
                System.out.print("*");
            }
            x = true;
            System.out.println();
            currentLine += 1;
        }
    }
    
    public static void createD(){
        Scanner scanD = new Scanner(System.in);
        int lengthOfPattern;
        int longestLine;
        int currentLine = 1;
        
        System.out.println("Enter how long you want the pattern (greater than 3)");
        lengthOfPattern = scanD.nextInt();
        
        if(lengthOfPattern % 2 == 1){
            longestLine = lengthOfPattern;
        }
        else {
            longestLine = lengthOfPattern - 1;
        }
        
        int test = lengthOfPattern;
        
        for(int i = lengthOfPattern; i > 0; i--){
            printCharacter(" ", Math.abs(lengthOfPattern)/2);
            printCharacter("*", starRepititions(currentLine, test, lengthOfPattern));
            System.out.println();
            currentLine += 1;
            lengthOfPattern -= 2;
        }
        
    }
    
    public static int starRepititions(int currentLine, int test, int lengthPattern){
        int FIX = Math.abs(lengthPattern);
        System.out.println("test is " + test);
        System.out.println("lengthPattern is " + lengthPattern);
        System.out.println("Fix is  " + FIX);
        if(lengthPattern > 0){
            return -1 + 2 * currentLine;
        }
        else{
            return test - FIX + 1;
        }
    }
}



