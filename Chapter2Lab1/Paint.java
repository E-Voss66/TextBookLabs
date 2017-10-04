//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length = 15;
            int width = 11;
            int height = 8;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
 
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt= calculateSqFt(length, width, height);
 
            //Compute the amount of paint needed
            paintNeeded = totalSqFt/COVERAGE;
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            
        }
        
        public static double calculateSqFt(int length, int width, int height){
            double walls = length*height*2 + width*height*2;
            double ceiling = length*width;
            return walls+ceiling;
        }
}