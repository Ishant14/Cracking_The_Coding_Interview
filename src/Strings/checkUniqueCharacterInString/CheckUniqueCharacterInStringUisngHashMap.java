package Strings.checkUniqueCharacterInString;

import jdk.nashorn.internal.runtime.BitVector;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igaurav on 5/28/2017.
 */
public class CheckUniqueCharacterInStringUisngHashMap {

    public static void main(String args[]) {
        String string = "abcdeff";
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
        Map<Character, Boolean> map = new HashMap();
        for (int i = 0; i < string.length(); i++) {
            if (!map.isEmpty() && map.containsKey(string.charAt(i))) {
                return false;
            } else {
                map.put(string.charAt(i), true);
            }
        }

        return true;
    }

}
