public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTournament("WorldCupFuusball", "01/01/2022", false);
        controller.loadTeamsToTournament("WorldCupFuusball");
        controller.postTeamsFromTournament("WorldCupFuusball");
        //controller.getTournament("WorldCupFuusball").createTeam();
        KnockOutTournament d = (KnockOutTournament) controller.getTournament("WorldCupFuusball");
        Bracket bracket = d.createBracket();
        bracket.processBracket();

    }
}
