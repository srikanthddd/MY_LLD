package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Combinations {
    public static void main(String[] args) {
        ArrayList<Integer> processed = new ArrayList<>();
        ArrayList<Integer> unProcessed = new ArrayList<>();
        unProcessed.add(1);
        unProcessed.add(2);
        unProcessed.add(3);
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        System.out.println(findCombinations(processed, unProcessed, out));
    }
    public static ArrayList<ArrayList<Integer>> findCombinations(ArrayList<Integer> processed, ArrayList<Integer> unProcessed, ArrayList<ArrayList<Integer>> out){
        if(processed.size() == 2){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(processed);
            out.add(list);
            return out;
        }
        int x = unProcessed.get(0);
        for(int i=0;i<=processed.size();i++){
            int num = unProcessed.get(i);
            processed.add(x);
            unProcessed.remove(i);
            findCombinations( processed, unProcessed, out);
        }
        return  out;
    }
}
