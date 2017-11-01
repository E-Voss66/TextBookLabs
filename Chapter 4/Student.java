// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    //-----------------------------------------------
    private String name;
    private int test1;
    private int test2;
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + this.name + "'s grades for test 1");
        test1 = scan.nextInt();
        System.out.println("Enter " + this.name + "'s grades for test 2");
        test2 = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage(){
        return (this.test1 + this.test2)/2.0;
        //add body of getAverage
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName(){
        //add body of getName
        return this.name;
    }
    
    
    public String toString(){
        return this.name + " got a " + this.test1 + " and " + this.test2 + " on test 1 and test 2." +
                " Their average is " + this.getAverage();
    }
}