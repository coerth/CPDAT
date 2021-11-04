import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    private ArrayList<Tournament> tournaments = new ArrayList<>();

    public void createTournament(String tournamentName, String startDate, boolean fixedDuration){
        tournaments.add(new KnockOutTournament(tournamentName, startDate, fixedDuration));

        for(Tournament t : tournaments){
            File file = new File("src/Tournaments/"+t.getName()+"Teams.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                continue;
            }
        }
    }

    public void deleteTournament(){

    }

    public void saveTournament(){

    }

    public Tournament getTournament(String tournamentName){
        Tournament tourn = null;
        for(Tournament t : tournaments){
            if(tournamentName.equals(t.getName())){
                tourn=t;
            }
        }
        return tourn;
    }

    public void loadTeamsToTournament(String tournamentName){
        for(Tournament t : tournaments){
          if(tournamentName.equals(t.getName())){
              try {
                  t.readTeamsFromFile();
              } catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
          }

        }

    }

    public void postTeamsFromTournament(String tournamentName){
        for(Tournament t : tournaments){
            if(tournamentName.equals(t.getName())){
                System.out.println(t.getTeams());
            }
        }
    }
}
