package StringProblems;

public class RemoveCharactersFromString_2 {

    public static void main(String[] args) {
        String a = "baccadhfa";
        char charToRemove = 'a';
        String out = "";
        int idx = 0;
        System.out.println(removeCharacters(a, idx, charToRemove));
    }

    //In this approach, we are not taking the output string in the argument, Instead, for every function call we are taking it new one.
    // And adding the result from the below function calls to the current one.
    public static String removeCharacters(String a, int idx, char target){
        String currOut = "";
        if(idx == a.length()){
            return  currOut;
        }
        if(a.charAt(idx)==target){
            return removeCharacters(a, idx + 1 , target);
        }
        currOut = currOut + a.charAt(idx);
        String outFromBelowFunctions  =  removeCharacters(a, idx + 1 , target);;
        return currOut + outFromBelowFunctions;
    }
}

