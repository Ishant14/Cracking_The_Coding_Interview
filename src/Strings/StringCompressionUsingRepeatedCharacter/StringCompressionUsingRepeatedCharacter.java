package Strings.StringCompressionUsingRepeatedCharacter;

/**
 * Created by igaurav on 5/29/2017.
 */
public class StringCompressionUsingRepeatedCharacter {

    public static void main(String args[]){
        String str="aabbcccccaaaa";
        int len =str.length();
        int count=1;
        StringBuilder resultString = new StringBuilder();
        resultString.append(str.charAt(0));
        char currentChar=str.charAt(0);
        for(int i=1;i<len;i++){
            if(str.charAt(i)==currentChar){
                count++;
            }else{
                resultString.append(count).append(str.charAt(i));
                count=1;
                currentChar=str.charAt(i);
            }
        }

        resultString.append(count);
        System.out.println(resultString);

    }

}
