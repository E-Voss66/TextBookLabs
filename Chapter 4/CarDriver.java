
public class CarDriver
{
    public static void main(String[] args){
        Car bob = new Car("Honda" , 2009);
        
        System.out.println(bob);
        
        Car joe = new Car("Ford", 2010);
        
        System.out.println(bob.equals(joe));
    }
}
