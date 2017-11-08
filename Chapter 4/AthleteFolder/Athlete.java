package AthleteFolder;


public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String str, int ag)
    {
        this.name = str;
        this.age = ag;
        
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
    
    public String toString(){
        return this.name + " and they are " + this.age + " years old";
    }

}
