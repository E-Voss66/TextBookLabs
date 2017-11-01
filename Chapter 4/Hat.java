
public class Hat
{
    private String color;
    private int size;
    
    public Hat(int sz, String clr)
    {
        // initialise instance variables
        this.size = sz;
        this.color = clr;
        
    }
    
    public String toString(){
        return "The hat's color is: " + this.color;
    }
    
    public int getHatSize(){
        return this.size;
    }
    
    public void setSize(int sz){
        this.size = sz;
    }

    
}
