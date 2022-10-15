package StringProblems;

import java.util.ArrayList;

public class PhoneNumber_Optimized {

    public static void main(String[] args) {

       String a = "012";
       ArrayList<String> list = new ArrayList<>();
       System.out.println(findCombinations("", a, list));
    }

    public static ArrayList<String> findCombinations(String processed, String unProcessed, ArrayList<String> output){

        if(unProcessed.length() == 0){
            output.add(processed);
            return output;
        }        
        char ch = unProcessed.charAt(0);
        if(ch == '1' || ch == '0'){
           processed = processed + ch;
           return findCombinations(processed, unProcessed.substring(1), output);
        }
        int number =Integer.parseInt(String.valueOf(ch));
        int st = (3*(number-2));
        int end = st + 3;

        for(int j= st;j< end; j++){

              char x = (char) ('a' + j);
              findCombinations(processed + x, unProcessed.substring(1), output) ;
        }

        return output;
    }
}
