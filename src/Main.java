import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String mySentence = "This is my sentence!";
        ArrayList<String> words1 = ArrayListAlgorithms.parseSentence(mySentence);
        System.out.println(words1);
        String mySentence2 = "It is a lovely day outside today don't you think?";
        ArrayList<String> words2 = ArrayListAlgorithms.parseSentence(mySentence2);
        System.out.println(words2);
        String mySentence3 = "Hello";
        ArrayList<String> words3 = ArrayListAlgorithms.parseSentence(mySentence3);
        System.out.println(words3);
    }
}