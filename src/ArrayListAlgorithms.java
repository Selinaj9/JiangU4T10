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

    /** Returns an arraylist of Strings that represents the input sentence parsed
     *  into separate words, using a single space (" ") as the delimiter
     *
     *  For example, if sentence = "This is my sentence!"
     *  this method return the arraylist: [This, is, my, sentence!]
     *
     *  PRECONDITION: sentence does not end with a space and each word is
     *                separated by exactly one space
     *
     *  @param sentence  the input String
     *  @return  new arraylist of Strings containing the words of sentence
     */
    public static ArrayList<String> parseSentence(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        int idx = sentence.indexOf(" ");
        while (idx != -1) {
            words.add(sentence.substring(0, idx));
            sentence = sentence.substring(idx + 1);
            idx = sentence.indexOf(" ");
        }
        words.add(sentence);
        return words;
    }
    /** Moves all words in wordList that begin with "b" to the front of
     *  wordList; all "b" words that are moved should appear in the same order
     *  in the modified arrayList as they did before being moved
     *
     *  For example, this method will take a wordList:
     *  ["apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"]
     *  and modify it to
     *  ["banana", "bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: - wordList.size() > 0
     *                 - all strings in wordList have length >= 1
     *
     *  @param wordList  arraylist of words
     */
    public static void moveBWords(ArrayList<String> wordList) {
        int idx = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).substring(0, 1).equals("b")) {
                wordList.add(idx, wordList.get(i));
                idx++;
                wordList.remove(i + 1);
            }
        }
    }

    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static void removeDuplicates(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            for (int j = 0; j < intList.size(); j++) {
                if (i != j && intList.get(i).equals(intList.get(j))) {
                    intList.remove(j);
                    j--;
                }
            }
        }
    }
}