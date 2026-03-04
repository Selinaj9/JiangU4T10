import java.util.ArrayList;

public class ArrayListAlgorithms {

    /**
     * Inserts toInsert after each String in stringList
     * that contains the letter "i"
     * <p>
     * DOES mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0, toInsert.length() > 0
     *
     * @param stringList original arraylist of Strings
     * @param str        String to insert
     */
    public static void insertAfterI(ArrayList<String> stringList, String str) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("i")) {
                stringList.add(i + 1, str);
                i++;
            }
        }
    }

    /** Removes all Strings from stringList that have a length of 3
     *
     *  DOES mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     */
    public static void removeThree(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() == 3) {
                stringList.remove(i);
                i--;
            }
        }
    }

    /** Returns an ArrayList with all elements of arr reversed
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original array of integers
     */
    public static ArrayList<Integer> reverseArray(int[] intList) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = intList.length - 1; i >= 0; i--) {
            ints.add(intList[i]);
        }
        return ints;
    }

    /** Appends an uppercase version of each string to the end of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: wordList.size() > 0,
     *                 all words in wordList are initially lowercase
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperEnd(ArrayList<String> wordList) {
        int words = wordList.size();
        for (int i = 0; i < words; i++) {
            wordList.add(wordList.get(i).toUpperCase());
        }
    }
}