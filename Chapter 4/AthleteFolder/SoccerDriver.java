package AthleteFolder;


public class SoccerDriver
{
    public static void main(String[] args){
        Team soccer = new Team("Acalanes Soccer", 20);
        
        Athlete jon = new Athlete("Jon", 17);
        
        soccer.addPlayer(jon, 0);
        
        System.out.println(soccer);
    }
}
