package Strings.checkUniqueCharacterInString;

/**
 * Created by igaurav on 5/28/2017.
 */

/*
* Question : Implement an algorithm to determine if a string has all unique characters or not .
* What if you can not use additional data structure.
*
* Solution : In java one simple O(n) solution for this problem would be using HashMap.
*            But since we are not allowed to use another data structure. We will use our knowledge of java ,
 *           In java there are only 256 different characters having ASCII values . Using this knowledge we
  *          will create any of 256 character and  since default value for boolean is false , Array will get initialised
  *          with all the false value for 256 character . Now we will traverse the String character one by one .
  *          As we found any character will put true for that character ASCII value in the array . If the same character
  *          comes again during traversing and we would find true for that and hence we will break the loop setting
  *          uniqueCharacter flag to false.
  *
  *         Time Complexity = O(n)
  *         Space Complexity = Fixed 256 character == O(1)
  *
  *        Test Cases :
  *        1) If String is null, it means all unique character .
  *        2) If String contains simple spaces  for eg. String str="    ", then it contains all unique characters.
  *        3) If String contains all unique character for eg String str="abcdef" , then it is unique.
  *        4) If String contains all same character for eg String str="aaaaaaaaaaa" , then it is non unique.
  *       5) If String conatins all boundary values as repeated like for eg. String str ="aabcedf" and "abdeff" , then still
  *       it is non unique.
  *       6) If String conatins all multiple repeated character then still it is non unique for eg. "ababcdcdeff".
  *
  *
* */

public class CheckUniqueCharacterInStringUsingArray {

    public static void main(String args[]) {

        String string = "aabcdef";

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
        boolean charArray[] = new boolean[256];
        for (int i = 0; i < string.length(); i++) {
            if (charArray[string.charAt(i)]) {
                return false;
            } else {
                charArray[string.charAt(i)] = true;
            }
        }
        return true;
    }

}
