package Lab2;

// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
   
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
        
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int test = 0;
        for(int x = row; x == row; x++){
            for(int y = 0; y < square[0].length; y++){
                test += square[x][y];
            }
        }
        
        
        
        return test;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int test = 0;
        for(int x = 0; x < square.length; x++){
            test += square[x][col];
        }
        
        return test;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int test = 0;
        int colNum = 0;
        for(int x = 0; x < square.length; x++){
            test += square[x][colNum];
            colNum++;
        }
        return test;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int test = 0;
        int colNum = square.length-1;
        for(int x = 0; x < square.length; x ++){
            test += square[x][colNum];
            colNum--;
        }
        return test;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //Change to work correctly
        boolean row = false;
        boolean col = false;
        int counter = 0;
        for(int x = 0; x < square.length-1; x++){
            if(sumRow(x) == sumRow(x+1)){
                counter += 1;
            }
            if(counter == square.length-1){
                row = true;
            }
        }
        counter = 0;
        for(int x = 0; x < square.length-1; x++){
            if(sumCol(x) == sumCol(x+1)){
                counter += 1;
            }
            if(counter == square.length-1){
                col = true;
            }
        }
        
        if(row && col && sumMainDiag() == sumRow(0) && sumMainDiag() == sumCol(0) && sumMainDiag() == sumOtherDiag()){
            return true;
        }
        return false;
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}
