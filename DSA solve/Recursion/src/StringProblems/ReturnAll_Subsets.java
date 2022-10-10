package StringProblems;

import java.util.ArrayList;

public class ReturnAll_Subsets {

    public static void main(String[] args) {
        String a = "abc";
        String out = "";
        System.out.println(printSubSets(a, 0, out, new ArrayList<>()));
    }

    public static ArrayList<String> printSubSets(String a, int idx, String sub, ArrayList<String> out){
        if(idx == a.length()){
            if(sub.length() > 0) {  // Not adding the empty subset.
                out.add(sub);
            }
            return out;
        }
        printSubSets(a, idx + 1, sub+ a.charAt(idx), out);
        printSubSets(a, idx + 1, sub, out);
        return out;
    }
}

