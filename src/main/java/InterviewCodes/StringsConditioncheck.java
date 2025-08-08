package InterviewCodes;

import java.util.ArrayList;
import java.util.List;

public class StringsConditioncheck {

    public static void main(String[] args) {

        String[] words ={"peep","random","moooom","daa@2aad"};
        List<String> satisfiedwords = new ArrayList<>();

        for (String word : words){
            if (word.charAt(0)==word.charAt(word.length()-1)){
                int lengthword = word.length();
                int divider = 0;
                while (lengthword%2==0){
                    lengthword =lengthword/2;
                }
               if (lengthword==1){
                   String reversed = "";
                   char c ;
                   for (int i =0;i<word.length();i++){
                       c = word.charAt(i);
                       reversed = c+reversed;

                   }
                   if(word.equals(reversed)){
                       satisfiedwords.add(reversed);

                   }
               }
            }
        }
        if (satisfiedwords.isEmpty()){
            System.out.println("No Matching elements");
        }else {
            System.out.println("Matching elements are: ");
            for (String word : satisfiedwords){
                System.out.println(word);
            }
        }
    }
}
