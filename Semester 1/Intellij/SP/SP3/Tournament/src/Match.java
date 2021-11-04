import java.util.Scanner;

public class Match {
    private Team[] teams = new Team[2];
    private Team winner;
    private String startTime;
    private int teamAScore;
    private int teamBScore;
    private int matchDuration;

    public Match(Team teamA, Team teamB) {
        this.teams[0] = teamA;
        this.teams[1] = teamB;
        this.startTime = startTime;
        this.matchDuration = matchDuration;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public String getStartTime() {
        return startTime;
    }

    public int getMatchDuration() {
        return matchDuration;
    }

    public Team getWinner() {
        return winner;
    }

    public Team processMatch(){
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println(teams[0].getName() + " VS " + teams[1].getName());
        System.out.println("Hvor mange point fik hold" + teams[0].getName()+"?");
        teamAScore = scan.nextInt();

        System.out.println("Hvor mange point fik hold" + teams[1].getName()+"?");
        teamBScore = scan.nextInt();

        if(teamAScore > teamBScore){
            teams[0] = winner;
        }
         else{
             teams[1] = winner;
        }

        return winner;
    }

    public void addGoalScore(){

    }

    @Override
    public String toString() {
        return "Match{" +
                "startTime='" + startTime + '\'' +
                ", TeamAScore=" + teamAScore +
                ", TeamBScore=" + teamBScore +
                ", matchDuration=" + matchDuration +
                '}';
    }
}
