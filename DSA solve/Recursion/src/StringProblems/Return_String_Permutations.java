package StringProblems;

import java.util.ArrayList;

public class Return_String_Permutations {
    public static void main(String[] args) {
        String givenString = "abc";
        String processed = "";

        System.out.println(printPermutaions(processed, givenString));
    }

    public static ArrayList<String> printPermutaions(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> permutaion = new ArrayList<>();
            permutaion.add(processed);
            return permutaion;
        }
        char ch = unProcessed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=processed.length();i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            ans.addAll(printPermutaions(first + ch + second, unProcessed.substring(1)));
        }
        return ans;
    }
}
