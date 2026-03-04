import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intList = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> rev = ArrayListAlgorithms.reverseArray(intList);
        System.out.println(rev);
        int[] intList2 = {0, 0, 0, 1, 1, 1};
        ArrayList<Integer> rev2 = ArrayListAlgorithms.reverseArray(intList2);
        System.out.println(rev2);
        System.out.println("original arrays not reversed:");
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(intList2));
    }
}