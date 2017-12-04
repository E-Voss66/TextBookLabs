package Lab2Problem2;


public class Compare2
{
    
    /**
     * Constructor for objects of class Compare2
     */
    public Compare2()
    {
        
    }
    
    public static Integer largest(Integer first, Integer second){
        if(first.compareTo(second) >= 0){
            return first;
        }
        else{
            return second;
        }
        
    }

}
