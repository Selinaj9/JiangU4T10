import java.util.ArrayList;
import java.util.Arrays;

public class SeasonTester {
    public static void main(String[] args) {
        Game g1 = new Game(3, 2);
        Game g2 = new Game(9, 8);
        Game g3 = new Game(4, 4);
        Game g4 = new Game(3, 2);
        Game g5 = new Game(6, 4);
        Game g6 = new Game(3, 1);
        Game g7 = new Game(0, 2);
        ArrayList<Game> games = new ArrayList<>(Arrays.asList(g1, g2, g3, g4, g5, g6, g7));
        Season season = new Season(games);
        int winStreak = season.getLongestHomeWinStreak();
        System.out.println("longest win streak = " + winStreak);
        if (winStreak == 3) {
            System.out.println("Test 1 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 1 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        ArrayList<Game> allGames = season.getAllGames();
        if (games == allGames
                && games.get(0) == allGames.get(0) && games.get(0).getHomeScore() == allGames.get(0).getHomeScore() && games.get(0).getAwayScore() == allGames.get(0).getAwayScore()
                && games.get(1) == allGames.get(1) && games.get(1).getHomeScore() == allGames.get(1).getHomeScore() && games.get(1).getAwayScore() == allGames.get(1).getAwayScore()
                && games.get(2) == allGames.get(2) && games.get(2).getHomeScore() == allGames.get(2).getHomeScore() && games.get(2).getAwayScore() == allGames.get(2).getAwayScore()
                && games.get(3) == allGames.get(3) && games.get(3).getHomeScore() == allGames.get(3).getHomeScore() && games.get(3).getAwayScore() == allGames.get(3).getAwayScore()
                && games.get(4) == allGames.get(4) && games.get(4).getHomeScore() == allGames.get(4).getHomeScore() && games.get(4).getAwayScore() == allGames.get(4).getAwayScore()
                && games.get(5) == allGames.get(5) && games.get(5).getHomeScore() == allGames.get(5).getHomeScore() && games.get(5).getAwayScore() == allGames.get(5).getAwayScore()
                && games.get(6) == allGames.get(6) && games.get(6).getHomeScore() == allGames.get(6).getHomeScore() && games.get(6).getAwayScore() == allGames.get(6).getAwayScore()) {
            System.out.println("allGames is unmodified\nTest 2 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 2 FAILS -- you broke postcondition and modified allGames !!!!!!!!!!!!!!");
        }
        System.out.println();
        games.add(g3);
        games.add(g3);
        games.add(g3);
        winStreak = season.getLongestHomeWinStreak();
        System.out.println("longest win streak = " + winStreak);
        if (winStreak == 3) {
            System.out.println("Test 3 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 3 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        Game g8 = new Game(5, 3);
        Game g9 = new Game(4, 2);
        Game g10 = new Game(3, 1);
        Game g11 = new Game(2, 1);
        games.add(g8);
        games.add(g9);
        games.add(g10);
        games.add(g11);
        winStreak = season.getLongestHomeWinStreak();
        System.out.println("longest win streak = " + winStreak);
        if (winStreak == 4) {
            System.out.println("Test 4 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 4 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        games.add(0, g8);
        games.add(0, g9);
        games.add(0, g10);
        winStreak = season.getLongestHomeWinStreak();
        System.out.println("longest win streak = " + winStreak);
        if (winStreak == 5) {
            System.out.println("Test 5 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 5 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        games.remove(0);
        winStreak = season.getLongestHomeWinStreak();
        System.out.println("longest win streak = " + winStreak);
        if (winStreak == 4) {
            System.out.println("Test 6 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 6 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
    }
}