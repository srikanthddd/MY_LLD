package StringProblems;

public class RemoveString_FromString {

    public static void main(String[] args) {
        String a = "baappleby";
        String stringToRemove = "apple";
        int idx = 0;
        System.out.println(removeCharacters(a, idx, stringToRemove));
    }
    //This method is to remove the given target string from the input String.
    public static String removeCharacters(String a, int idx, String target){
        String currOut = "";
        if(idx == a.length()){
            return  currOut;
        }
        if(a.substring(idx).startsWith(target)){
            return removeCharacters(a, idx + target.length(), target);
        }
        currOut = currOut + a.charAt(idx);
        String outFromBelowFunctions  =  removeCharacters(a, idx + 1 , target);
        return currOut + outFromBelowFunctions;
    }
}

