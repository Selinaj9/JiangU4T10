import java.util.ArrayList;
import java.util.Arrays;

public class GameTester {
    public static void main(String[] args) {
        GameAccount acc1 = new GameAccount("happy_hero", 13);
        GameAccount acc2 = new GameAccount("star_guy", 23);
        GameAccount acc3 = new GameAccount("a_knight", 14);
        GameAccount acc4 = new GameAccount("dino_dan", 12);
        GameAccount acc5 = new GameAccount("cool_cat", 15);
        GameAccount acc6 = new GameAccount("fox_sox", 19);
        ArrayList<GameAccount> accounts = new ArrayList<>(Arrays.asList(acc1, acc2, acc3, acc4, acc5, acc6));
        GamePlatform platform = new GamePlatform(accounts);
        double avg = platform.avgTeenAccounts();
        System.out.println(avg);
        if (avg == 15.25) {
            System.out.println("Test 1 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 1 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();

        ArrayList<GameAccount> gameAccs = platform.getAllPlayers();
        if (accounts == gameAccs
                && accounts.get(0) == gameAccs.get(0) && accounts.get(0).getUsername().equals(gameAccs.get(0).getUsername()) && accounts.get(0).getAge() == gameAccs.get(0).getAge()
                && accounts.get(1) == gameAccs.get(1) && accounts.get(1).getUsername().equals(gameAccs.get(1).getUsername()) && accounts.get(1).getAge() == gameAccs.get(1).getAge()
                && accounts.get(2) == gameAccs.get(2) && accounts.get(2).getUsername().equals(gameAccs.get(2).getUsername()) && accounts.get(2).getAge() == gameAccs.get(2).getAge()
                && accounts.get(3) == gameAccs.get(3) && accounts.get(3).getUsername().equals(gameAccs.get(3).getUsername()) && accounts.get(3).getAge() == gameAccs.get(3).getAge()
                && accounts.get(4) == gameAccs.get(4) && accounts.get(4).getUsername().equals(gameAccs.get(4).getUsername()) && accounts.get(4).getAge() == gameAccs.get(4).getAge()
                && accounts.get(5) == gameAccs.get(5) && accounts.get(5).getUsername().equals(gameAccs.get(5).getUsername()) && accounts.get(5).getAge() == gameAccs.get(5).getAge()) {
            System.out.println("allPlayers is unmodified\nTest 2 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 2 FAILS -- you broke postcondition and modified allPlayers !!!!!!!!!!!!!!");
        }
        System.out.println();
        GameAccount acc7 = new GameAccount("holly_jolly", 20);
        GameAccount acc8 = new GameAccount("peter_piper", 21);
        GameAccount acc9 = new GameAccount("loopy_lou", 13);
        ArrayList<GameAccount> accounts2 = new ArrayList<>(Arrays.asList(acc7, acc8, acc9));
        GamePlatform platform2 = new GamePlatform(accounts2);
        double avg2 = platform2.avgTeenAccounts();
        System.out.println(avg2);
        if (avg2 == 13.0) {
            System.out.println("Test 3 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 3 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
    }
}