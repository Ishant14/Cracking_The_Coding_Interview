package Strings.ReplaceSpaceInStringWithPercentage20;

/**
 * Created by igaurav on 5/29/2017.
 */
public class ReplaceSpaceInStringWithPercentage20 {

    public static void main(String args[]){
        String str = "Mr John Smith    ";
        int length=13;
        char[] charArray = str.toCharArray();
        int spaceCount=0;
        for(int i=0;i<13;i++){
            if(charArray[i]==' '){
                spaceCount++;
            }
        }
        int actualLength=(length-spaceCount)+(spaceCount*3);
        int resultArrayCounter=actualLength-1;
        int oldArrayCounter=length-1;

        while (oldArrayCounter >=0 && resultArrayCounter >=0){
            if(charArray[oldArrayCounter]==' '){
                charArray[resultArrayCounter]='0';
                resultArrayCounter--;
                charArray[resultArrayCounter]='2';
                resultArrayCounter--;
                charArray[resultArrayCounter]='%';
                resultArrayCounter--;
                oldArrayCounter--;
            }else{
                charArray[resultArrayCounter]=charArray[oldArrayCounter];
                resultArrayCounter--;
                oldArrayCounter--;
            }
        }
        String resultString = String.valueOf(charArray);
        System.out.println(resultString);

    }

}
