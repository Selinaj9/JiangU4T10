import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
        ArrayListAlgorithms.duplicateUpperEnd(stringList);
        System.out.println(stringList);
    }
}