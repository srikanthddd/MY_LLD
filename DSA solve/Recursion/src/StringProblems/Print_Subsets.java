package StringProblems;

public class Print_Subsets {

    public static void main(String[] args) {
        String a = "abc";
        String out = "";
        printSubSets(a, 0, out);
    }

    public static void printSubSets(String a, int idx, String sub){
        if(idx == a.length()){
            System.out.println(sub);
            return;
        }
        printSubSets(a, idx + 1, sub+ a.charAt(idx));
        printSubSets(a, idx + 1, sub);
    }
}

