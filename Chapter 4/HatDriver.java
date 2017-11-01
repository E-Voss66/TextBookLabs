
public class HatDriver
{
    public static void main(String[]args){
        Hat bob = new Hat(12, "Black");
        
        System.out.println(bob);
        bob.setSize(10);
        System.out.println(bob.getHatSize());
    }
}
