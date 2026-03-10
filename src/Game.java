public class Game {
    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    private int homeScore;
    private int awayScore;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public Game(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    /**
     * Returns the home team's score for this game
     */
    public int getHomeScore() {
        return homeScore;
    }

    /**
     * Returns the away team's score for this game
     */
    public int getAwayScore() {
        return awayScore;
    }
}