
public class Pet
{
    private int age;
    private String name;
    private boolean alive;
    public static int numPets;
    
    public Pet(int ag, String nm, boolean al){
        this.age = ag;
        this.name = nm;
        this.alive = al;
        numPets++;
    }
    
    public static void example(){
        System.out.println("This is static");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAlive(boolean al){
        this.alive = al;
    }
    
    public String toString(){
        return "The pet's name is: " + this.name;
    }
    
    
}
