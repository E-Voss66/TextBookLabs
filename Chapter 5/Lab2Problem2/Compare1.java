package Lab2Problem2;

public class Compare1
{
    
    
    /**
     * Constructor for objects of class Compare1
     */
    public Compare1()
    {
        
    }
    
    public static String largest(String s1, String s2){
        if(s1.compareTo(s2) > 0){
            return s1;
        } else if( s1.compareTo(s2) < 0){
            return s2;
        }
        else{
            return s1 + " is equal to " + s2;
        }
    }
    
    

    
}
