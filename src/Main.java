import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "is", "not", "a", "trivial", "task", "right?"));
        ArrayListAlgorithms.insertAfterI(stringList, "bob");
        System.out.println(stringList);
        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "is", "not", "a", "trivial", "task", "right?"));
        ArrayListAlgorithms.insertAfterI(stringList2, "hi");
        System.out.println(stringList2);
        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("hi", "lie", "is", "tis"));
        ArrayListAlgorithms.insertAfterI(stringList3, "mild");
        System.out.println(stringList3);
        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("the", "best", "not", "ever", "seen"));
        ArrayListAlgorithms.insertAfterI(stringList4, "pie");
        System.out.println(stringList4);

    }
}