import java.util.ArrayList;
import java.util.Arrays;

public class ItemTester {
    public static void main(String[] args) {
        ItemInfo item1 = new ItemInfo("action figure", 20.0, true);
        ItemInfo item2 = new ItemInfo("hair brush", 7.99, true);
        ItemInfo item3 = new ItemInfo("frying pan", 45.0, true);
        ItemInfo item4 = new ItemInfo("dish sponge", 2.0, false);
        ItemInfo item5 = new ItemInfo("coffee mug", 10.0, true);
        ItemInfo item6 = new ItemInfo("scarf", 59.0, true);
        ItemInfo item7 = new ItemInfo("watch", 45.0, false);
        ArrayList<ItemInfo> items = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5, item6, item7));
        ItemInventory inventory = new ItemInventory(items);
        double average = inventory.averageWithinRange(10.0, 50.0);
        System.out.println(average);
        if (average == 25.0) {
            System.out.println("Test 1 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 1 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        ItemInfo item8 = new ItemInfo("tennis ball", 13.5, true);
        items.add(item8);
        average = inventory.averageWithinRange(10.0, 50.0);
        System.out.println(average);
        if (average == 22.125) {
            System.out.println("Test 2 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 2 FAILS !!!!!!!!!!!!!!");
        }
        System.out.println();
        ItemInfo item9 = new ItemInfo("belt", 32.0, false);
        items.add(item9);
        ItemInfo item10 = new ItemInfo("candy bar", 1.5, true);
        items.add(item10);
        ItemInfo item11 = new ItemInfo("DVD player", 65, true);
        items.add(item11);
        average = inventory.averageWithinRange(0.0, 70);
        System.out.println(average);
        if (average == 27.74875) {
            System.out.println("Test 3 passes");
        } else {
            System.out.println("!!!!!!!!!!!!!! TEST 3 FAILS !!!!!!!!!!!!!!");
        }
    }
}