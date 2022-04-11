package lesson16;

public class MainGame {
    public static void main(String[] args) {
        AnaliticParticipant analiticParticipant = new AnaliticParticipant("Ольга", 30);
        AnaliticParticipant analiticParticipant2 = new AnaliticParticipant("Кирилл", 28);

        DeveloperParticipant developerParticipant = new DeveloperParticipant("Иван", 26);
        DeveloperParticipant developerParticipant2 = new DeveloperParticipant("Катя", 38);

        DeveloperParticipant developerParticipant3 = new DeveloperParticipant("Дима", 35);
        DeveloperParticipant developerParticipant4 = new DeveloperParticipant("Елена", 29);

        Team<AnaliticParticipant> analyticTeam = new Team();
        analyticTeam.setName("Pineapple");
        analyticTeam.addParticipantToTeam(analiticParticipant);
        analyticTeam.addParticipantToTeam(analiticParticipant2);

        Team<DeveloperParticipant> developerTeam = new Team();
        developerTeam.setName("Tigers");
        developerTeam.addParticipantToTeam(developerParticipant);
        developerTeam.addParticipantToTeam(developerParticipant2);

        Team<DeveloperParticipant> developerTeam2 = new Team();
        developerTeam2.setName("Kings");
        developerTeam2.addParticipantToTeam(developerParticipant3);
        developerTeam2.addParticipantToTeam(developerParticipant4);
        


        developerTeam.winnerTeam(developerTeam2);

    }
}
