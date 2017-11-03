import java.util.Scanner;
public class NameDriver
{
    public static void main(String[] args){
        String firstNm, middleNm, lastNm;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a first name");
        firstNm = scan.nextLine();
        System.out.println("Enter a middle name");
        middleNm = scan.nextLine();
        System.out.println("Enter a last name");
        lastNm = scan.nextLine();
        
        Name userName = new Name(firstNm, middleNm, lastNm);
        
        System.out.println(userName.firstMiddleLast());
        System.out.println(userName.lastMiddleFirst());
        System.out.println(userName.initials());
        System.out.println(userName.length());
        
        Name newName = new Name("Joe", "Smith", "White");
        
        System.out.println(userName.equals(newName));
        
    }
}
