import java.util.ArrayList;

public class ItemInventory {

    /** The list of all items at the store */
    private ArrayList<ItemInfo> inventory;

    // NOT PROVIDED IN THE FRQ; ADDED HERE TO ENABLE TESTING
    public ItemInventory(ArrayList<ItemInfo> inventory) {
        this.inventory = inventory;
    }

    /**
     * Returns the average cost of the available items
     * whose cost is between lower and upper, inclusive
     * Precondition: lower <= upper
     * At least one available element of
     * inventory has a cost between
     * lower and upper, inclusive.
     *
     No elements of inventory are null.
     */
    public double averageWithinRange(double lower, double upper) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < inventory.size(); i++) {
            double cost = inventory.get(i).getCost();
            if (cost >= lower && cost <= upper && inventory.get(i).isAvailable()) {
                sum += cost;
                count++;
            }
        }
        return sum / count;
    }
}