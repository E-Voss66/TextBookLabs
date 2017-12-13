package Lab2;


public class PowerOfTwo
{
    
    public static void main(String[] args){
        int[][] originalArray = new int[3][3];
        int[][] squaredArray = new int[3][3];
        
        originalArray = populateArray(originalArray);
        
        for(int x = 0; x < originalArray.length; x++){
            for(int y = 0; y < originalArray[0].length; y++){
                System.out.print(originalArray[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        squaredArray = squareArray(originalArray, squaredArray);
        
        for(int x = 0; x < squaredArray.length; x++){
            for(int y = 0; y < squaredArray[0].length; y++){
                System.out.print(squaredArray[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] populateArray(int[][] array){
        int num = 0;
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[0].length; y++){
                array[x][y] += num;
                num++;
            }
        }
        return array;
    }
    
    public static int[][] squareArray(int[][] origArray, int[][] finalArray){
        for(int row = 0; row < origArray.length; row++){
            for(int col = 0; col < origArray[0].length; col++){
                finalArray[row][col] = origArray[row][col] * origArray[row][col];
                
            }
        }
        
        return finalArray;
    }
}
