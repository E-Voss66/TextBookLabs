
public class Author
{
    private int age;
    private String name;
    
    public Author(String nm, int ag)
    {
        this.name = nm;
        this.age = ag;
    }
    public String toString(){
        return this.name + " who is " + this.age + " years old.";
    }

    
}
