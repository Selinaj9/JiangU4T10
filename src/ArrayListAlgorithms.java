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
}