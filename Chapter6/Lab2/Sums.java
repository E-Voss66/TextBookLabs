package Lab2;


public class Sums
{
    static int[] sums = new int[3];
    static int temp;
    static int[] temp2 = new int[3];
    
    public static void main(String[] args){
        int[][] test2 = new int[3][4];
        
        test2 = populateArray(test2);
        
        temp2 = sumColumns(test2);
        
        System.out.println(temp2[0] + " " + temp2[1] + " " + temp2[2]);
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
    
    public static int[] sumColumns(int[][] nums){
        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums[0].length; y++){
                temp += nums[x][y];
            }
            sums[x] = temp;
            temp = 0;
        }
        
        return sums;
    }
}
