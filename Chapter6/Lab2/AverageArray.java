package Lab2;


public class AverageArray
{
    static int totalSum =0;
    public static void main(String[] args){
        int[][] test2 = new int[3][4];
        
        test2 = populateArray(test2);
        
        System.out.println(average(test2));
        
    }
    
    public static int[][] populateArray(int[][] array){
        int num = 0;
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 4; y++){
                array[x][y] += num;
                num++;
            }
        }
        return array;
    }
    
    public static double average(int[][] nums){
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                totalSum += nums[row][col];
            }
        }
        
        return totalSum/(nums.length*nums[0].length);
    }
}
