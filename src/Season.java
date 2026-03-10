import java.util.ArrayList;

public class Season {

    /** The list of all games played during the season */
    private ArrayList<Game> allGames;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public Season(ArrayList<Game> allGames) {
        this.allGames = allGames;
    }

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public ArrayList<Game> getAllGames() {
        return allGames;
    }

    /**
     * Returns the number of games in the longest streak of
     * consecutive games where the home team scored more than
     * the away team
     * Preconditions: allGames is not empty.
     * No elements of allGames are null.
     * Postcondition: allGames is unchanged.
     */
    public int getLongestHomeWinStreak() {
        int streak = 0;
        int count = 0;
        for (Game game : allGames) {
            if (game.getHomeScore() > game.getAwayScore()) {
                count++;
            } else {
                if (count > streak) {
                    streak = count;
                }
                count = 0;
            }
        }
        if (count > streak) {
            streak = count;
        }
        return streak;
    }
}