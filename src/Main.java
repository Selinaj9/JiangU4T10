import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("the", "not", "skim", "pat", "a", "rat", "cat", "sit", "truck", "par", "tar"));
        ArrayListAlgorithms.removeThree(stringList);
        System.out.println(stringList);
        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("not", "ton", "lot", "awe", "rat", "art", "tar"));
        ArrayListAlgorithms.removeThree(stringList2);
        System.out.println(stringList2);
        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("hi", "pint", "is", "them"));
        ArrayListAlgorithms.removeThree(stringList3);
        System.out.println(stringList3);
    }
}