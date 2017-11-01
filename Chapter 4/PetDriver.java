
public class PetDriver
{
    public static void main(String[] args){
        Pet kona = new Pet(14, "Kona", true);
        
        System.out.println(kona);
        kona.setAlive(false);
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
        Pet sam = new Pet(12, "Sam", true);
        System.out.println("Number of pets: " + Pet.numPets);
    }
}
