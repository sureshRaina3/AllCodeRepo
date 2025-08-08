package InterviewCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharactersWithoutDuplicate {

    public static void withforloop(){

        String s = "My name is suresh";
        char Ch[] = s.toLowerCase().toCharArray();

        for (int i =0;i<Ch.length-1;i++){
            for (int j = i+1; j <Ch.length; j++){
                if (Ch[i]==Ch[j]){
                    Ch[j]=' ';
                }
            }
        }
        for(char one :Ch){
            if (one!=' '){
                System.out.print(one);
            }
        }




    }

    public static void withoutForloop (){

        String s = "My name is suresh";
        char[] Ch = s.toLowerCase().toCharArray();

        List<Character> sList = new ArrayList<Character>();
        for(char one :Ch){
            sList.add(one);
        }
        Set<Character> settings = new HashSet<Character>(sList);
        for(char one :settings){
            if (one!=' '){
                System.out.print(one);
            }
        }




    }

    public static void main(String[] args) {

        withoutForloop();
        System.out.println();
        withforloop();
    }
}
