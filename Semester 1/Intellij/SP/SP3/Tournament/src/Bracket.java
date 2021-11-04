import java.util.ArrayList;
import java.util.Arrays;

public class Bracket {
    private Match[] finals = new Match[1];
    private Match[] semiFinal = new Match[2];
    private Match[] quarterFinal = new Match[4];
    private Match[] preliminaryFinal = new Match[8];

    public void processBracket(){
        processPreliminaryFinal();
        processQuarterFinal();
        processSemiFinal();
        processFinal();
    }

    public Team processFinal(){
        Team tournamentWinner;
        tournamentWinner = finals[0].processMatch();

        return tournamentWinner;
    }

    public void processSemiFinal(){
        Team[] teams = new Team[2];
        int i = 0;

        for(Match match : semiFinal){
            teams[i] = match.processMatch();
            i++;
        }

        createFinal(teams);
    }

    public void processQuarterFinal(){
        Team[] teams = new Team[4];
        int i = 0;

        for(Match match : quarterFinal){
            teams[i] = match.processMatch();
            i++;
        }

        createSemiFinal(teams);
    }


    public void processPreliminaryFinal(){
        Team[] teams = new Team[8];
        int i = 0;
        for(Match match : preliminaryFinal){
            teams[i] = match.processMatch();
            i++;
        }

        createQuarterFinal(teams);
    }



    public void createFinal(Team[] teams){
        finals[0] = new Match(teams[0], teams[1]);
    }

    public void createSemiFinal(Team[] teams) {
        int i = 0;
        int j = 1;

        for(int k = 0; k<semiFinal.length; k++){
            semiFinal[k] = new Match(teams[i], teams[j]);
            i += 2;
            j += 2;
        }
    }

    public void createQuarterFinal(Team[] teams) {
        int i = 0;
        int j = 1;

        for(int k = 0; k<quarterFinal.length; k++){
            quarterFinal[k] = new Match(teams[i], teams[j]);
            i += 2;
            j += 2;
        }
    }

    public void createPreliminaryFinal(ArrayList<Team> teams) {
        int i = 0;
        int j = 1;

        for(int k = 0; k<preliminaryFinal.length; k++){
            preliminaryFinal[k] = new Match(teams.get(i), teams.get(j));
            i += 2;
            j += 2;
        }
    }


    public Match[] getFinals() {
        return finals;
    }

    public Match[] getSemiFinal() {
        return semiFinal;
    }

    public Match[] getQuarterFinal() {
        return quarterFinal;
    }

    public Match[] getPreliminaryFinal() {
        return preliminaryFinal;
    }


}