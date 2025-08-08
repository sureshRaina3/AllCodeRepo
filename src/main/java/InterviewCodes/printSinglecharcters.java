package InterviewCodes;

public class printSinglecharcters {

    public static void main(String[] args) {
        String s = "Hello My name is suresh";

        char [] cha = s.toLowerCase().toCharArray();
        int count =0;
        for(int i=0; i<cha.length-1; i++ ){
            count =1;
            for (int j=i+1;j<cha.length;j++){
                if (cha[i]==cha[j]){
                    count++;
                    cha[j]=' ';
                }

            }
            if (count==1 && cha[i]!=' '){
                System.out.println(cha[i]);
            }


        }
    }




}
