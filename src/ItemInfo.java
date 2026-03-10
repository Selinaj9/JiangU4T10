public class ItemInfo {

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    private String name;
    private double cost;
    private boolean available;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public ItemInfo(String name, double cost, boolean available) {
        this.name = name;
        this.cost = cost;
        this.available = available;
    }

    /**
     * Returns the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a value greater than 0.0 that represents the
     * cost of a single unit of the item, in dollars
     */
    public double getCost() {
        return cost;
    }

    /**
     * Returns true if the item is currently available and
     * returns false otherwise
     */
    public boolean isAvailable() {
        return available;
    }
}