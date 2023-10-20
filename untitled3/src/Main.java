
class Player {
    public Player(String name) {
    }

    public void joinTeam(String teamName) {
    }
}

class Team {
    public Team(String name) {
    }

    public void addPlayer(Player player) {
    }
}

class Match {
    public Match(Team homeTeam, Team awayTeam) {
    }

    public void play() {
    }
}

class PlayerAdapter implements FootballManager {
    private Player player;

    public PlayerAdapter(String playerName) {
        this.player = new Player(playerName);
    }

    @Override
    public void createTeam(String teamName) {
        Team team = new Team(teamName);
        team.addPlayer(player);
        player.joinTeam(teamName);
    }

    @Override
    public void addPlayerToTeam(String playerName, String teamName) {
        Player newPlayer = new Player(playerName);
        Team team = new Team(teamName);
        team.addPlayer(newPlayer);
        newPlayer.joinTeam(teamName);
    }

    @Override
    public void scheduleMatch(String homeTeam, String awayTeam) {
    }

    @Override
    public void playMatch(String homeTeam, String awayTeam) {
    }
}

public class Main {
    public static void main(String[] args) {
        FootballManager playerAdapter = new PlayerAdapter("Messi");

        playerAdapter.createTeam("Argentina");
        playerAdapter.addPlayerToTeam("Neymar", "Brazil");
        playerAdapter.scheduleMatch("Argentina", "Brazil");
        playerAdapter.playMatch("Argentina", "Brazil");
    }
}
