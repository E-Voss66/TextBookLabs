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
        
        while(currentLine <= longestLine){
            for(int i = currentLine; i > 0 ; i --){
                System.out.print("*");
            }
            System.out.println();
            currentLine += 1;
        }
    }
    
    public static void createC(){
        Scanner scanC = new Scanner(System.in);
        int longestLine;
        int currentLine = 0;
        boolean x = true;
        
        System.out.println("Enter how long you want you want the pattern");
        longestLine = scanC.nextInt();
        
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
}



