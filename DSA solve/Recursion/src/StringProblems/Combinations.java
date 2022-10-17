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
        unProcessed.add(4);
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        int idx = 0;
        //System.out.println(findCombinations(idx, processed, unProcessed, out));
    }

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {

        int idx = 0;
        ArrayList<Integer> unProcessed = new ArrayList<>();
        for(int i=1;i<=A;i++){
            unProcessed.add(i);
        }
        ArrayList<Integer> processed = new ArrayList<>();
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();

        return findCombinations(B, idx, processed, unProcessed, out);
    }
    public static ArrayList<ArrayList<Integer>> findCombinations(int B, int idx,ArrayList<Integer> processed, ArrayList<Integer> unProcessed, ArrayList<ArrayList<Integer>> out){
        if(processed.size() == 2){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(processed);
            out.add(list);
            return out;
        }

        for(int i=idx;i<unProcessed.size();i++){
            int element = unProcessed.get(i);
            processed.add(element);
            unProcessed.remove(i);
            findCombinations(B, i, processed, unProcessed, out);
            processed.remove(processed.size()-1);
            unProcessed.add(i, element);
        }
        return out;
    }
}
