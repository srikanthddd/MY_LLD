package StringProblems;

public class RemoveCharactersFromString {

    public static void main(String[] args) {
        String a = "baccad";
        char charToRemove = 'a';
        String out = "";
        int idx = 0;
        System.out.println(removeCharacters(a, idx, charToRemove, out));
    }
    public static String removeCharacters(String a, int idx, char target, String output){
        if(idx == a.length()){
            return  output;
        }
        if(a.charAt(idx)==target){
            return removeCharacters(a, idx + 1 , target, output);
        }
        output = output + a.charAt(idx);
        return removeCharacters(a, idx + 1 , target, output);
    }
}

