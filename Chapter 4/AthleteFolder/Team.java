package AthleteFolder;


public class Team
{
    private String teamName;
    private Athlete[] players;
    
    public Team(String tmNm, int numPlayers)
    {
        this.teamName = tmNm;
        this.players = new Athlete[numPlayers];
    }
    
    public String toString(){
        String output;
        
        output = "This team has players: ";
        
        for(Athlete a : this.players){
            output += "\n" + a;
        }
        
        return output;
    }
    
    public void addPlayer(Athlete otherPlayer, int i){
        this.players[i] = otherPlayer;
    }

}
