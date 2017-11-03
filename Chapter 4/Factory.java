
public class Factory
{
    private double sqFootage;
    private Car[] inventory;
    
    public Factory(double sqFT, int number)
    {
        this.sqFootage = sqFT;
        this.inventory = new Car[number];
    }
    
    public void setCar(Car c, int index){
        this.inventory[index] = c;
    }
    
    public String toString(){
        String output = "This factory has \n";
        for(Car c : inventory){
            output += c + "\n";
        }
        
        
        return output;
    }

}
