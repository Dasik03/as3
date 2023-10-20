public interface FootballManager {
    void createTeam(String teamName);
    void addPlayerToTeam(String playerName, String teamName);
    void scheduleMatch(String homeTeam, String awayTeam);
    void playMatch(String homeTeam, String awayTeam);
}
