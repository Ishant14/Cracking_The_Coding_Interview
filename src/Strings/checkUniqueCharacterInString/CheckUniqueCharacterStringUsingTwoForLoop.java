package Strings.checkUniqueCharacterInString;

/**
 * Created by igaurav on 5/28/2017.
 */
public class CheckUniqueCharacterStringUsingTwoForLoop {

    public static void main(String args[]) {

        String string = "abcdef";

        if (findIsUnique(string)) {
            System.out.println("String contains all unique characters");
        } else {
            System.out.println("String contains repeated characters as well");
        }
    }

    public static boolean findIsUnique(String string) {

        if (null == string || string.trim().length() == 0) {
            return true;
        }
        int len = string.length();
        for (int i = 0; i < len; i++) {
            for (int k = i + 1; k < len; k++) {
                if (string.charAt(i) == string.charAt(k)) {
                    return false;
                }
            }
        }

        return true;
    }

}
