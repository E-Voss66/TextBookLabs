
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
   public static void main(String[] args){
       int rowNumber = 1;
       int columnNumber = 1;
       
       createRow(rowNumber, columnNumber);
    }
    
   public static void createRow(int rowNumber, int columnNumber){
       for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                System.out.print(rowNumber*columnNumber + "\t");
                columnNumber += 1;
            }
            columnNumber = 1;
            System.out.println();
            rowNumber += 1;
        }
       
       
    }
}


