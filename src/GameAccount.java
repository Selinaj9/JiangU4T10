public class GameAccount {

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    private String userName;
    private int age;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public GameAccount(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    /**
     * Returns the username of the player
     */
    public String getUsername() {
        return userName;
    }

    /**
     * Returns the age of the player
     */
    public int getAge() {
        return age;
    }
}