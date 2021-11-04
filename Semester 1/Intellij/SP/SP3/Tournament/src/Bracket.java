import java.util.ArrayList;
import java.util.Arrays;

public class Bracket {
    private ArrayList<Arrays> playOffs = new ArrayList<>();
    private Match[] finals = new Match[1];
    private Match[] semiFinal = new Match[2];
    private Match[] quarterFinal = new Match[4];
    private Match[] preliminaryFinal = new Match[8];

    public void processPlayOffs(){
        processPreliminaryFinal();
        processQuarterFinal();
        processSemiFinal();
        processFinal();
    }

    public void processFinal(){
        Team tournamentWinner;
        tournamentWinner = finals[0].processMatch();

    }

    public void processSemiFinal(){
        Team teamWinnerA;
        Team teamWinnerB;

        teamWinnerA = semiFinal[0].processMatch();
        teamWinnerB = semiFinal[1].processMatch();

        createFinal(teamWinnerA, teamWinnerB);
    }

    public void processQuarterFinal(){
        Team teamWinnerA;
        Team teamWinnerB;
        Team teamWinnerC;
        Team teamWinnerD;

        teamWinnerA = quarterFinal[0].processMatch();
        teamWinnerB = quarterFinal[1].processMatch();
        teamWinnerC = quarterFinal[2].processMatch();
        teamWinnerD = quarterFinal[3].processMatch();

        createSemiFinal(teamWinnerA, teamWinnerB, teamWinnerC, teamWinnerD);
    }


    public void processPreliminaryFinal(){
        Team teamWinnerA;
        Team teamWinnerB;
        Team teamWinnerC;
        Team teamWinnerD;
        Team teamWinnerE;
        Team teamWinnerF;
        Team teamWinnerG;
        Team teamWinnerH;

        teamWinnerA = preliminaryFinal[0].processMatch();
        teamWinnerB = preliminaryFinal[1].processMatch();
        teamWinnerC = preliminaryFinal[2].processMatch();
        teamWinnerD = preliminaryFinal[3].processMatch();
        teamWinnerE = preliminaryFinal[0].processMatch();
        teamWinnerF = preliminaryFinal[1].processMatch();
        teamWinnerG = preliminaryFinal[2].processMatch();
        teamWinnerH = preliminaryFinal[3].processMatch();

        createQuarterFinal(teamWinnerA, teamWinnerB, teamWinnerC, teamWinnerD,teamWinnerE, teamWinnerF, teamWinnerG, teamWinnerH);
    }



    public void createFinal(Team teamA, Team teamB){
        finals[0] = new Match(teamA, teamB);
    }

    public void createSemiFinal(Team teamA, Team teamB, Team teamC, Team teamD) {
    semiFinal[0] = new Match(teamA, teamB);
    semiFinal[1] = new Match(teamC, teamD);
    }

    public void createQuarterFinal(Team teamA, Team teamB, Team teamC, Team teamD, Team teamE, Team teamF, Team teamG, Team teamH) {
        quarterFinal[0] = new Match(teamA, teamB);
        quarterFinal[1] = new Match(teamC, teamD);
        quarterFinal[2] = new Match(teamE, teamF);
        quarterFinal[3] = new Match(teamG, teamH);
    }

    public void createPreliminaryFinal(Team teamA, Team teamB, Team teamC, Team teamD, Team teamE, Team teamF, Team teamG, Team teamH,
                                       Team teamI, Team teamJ, Team teamK, Team teamL, Team teamM, Team teamN, Team teamO, Team teamP) {

        preliminaryFinal[0] = new Match(teamA, teamB);
        preliminaryFinal[1] = new Match(teamC, teamD);
        preliminaryFinal[2] = new Match(teamE, teamF);
        preliminaryFinal[3] = new Match(teamG, teamH);
        preliminaryFinal[4] = new Match(teamI, teamJ);
        preliminaryFinal[5] = new Match(teamK, teamL);
        preliminaryFinal[6] = new Match(teamM, teamN);
        preliminaryFinal[7] = new Match(teamO, teamP);
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
