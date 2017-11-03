
public class Car
{
    private String model;
    private int year;
    
    public Car(String mdl, int yr)
    {
        this.model = mdl;
        this.year = yr;
    }
    
    public String toString(){
        return "This car is a " + this.year + " " + this.model;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public boolean equals(Car otherCar){
        if (this.model.equals(otherCar.model) && this.year == otherCar.year){
            return true;
        }
        else{
            return false;
        }
    }

}
