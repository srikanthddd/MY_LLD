package StringProblems;

import java.util.ArrayList;

public class ArrayPermutations_1 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        System.out.println(permute(input));
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

        ArrayList<Integer> unProcessed = A;
        ArrayList<Integer> processed = new ArrayList<>();

        return Permutations(processed, unProcessed);
    }

    public static ArrayList<ArrayList<Integer>> Permutations(ArrayList<Integer> processed,
                                                             ArrayList<Integer> unProcessed){

        if(unProcessed.size() == 0){
            ArrayList<ArrayList<Integer>> onePermutation = new ArrayList<>();
            onePermutation.add(processed);
            return onePermutation;
        }

        int current = unProcessed.get(0);
        ArrayList<ArrayList<Integer>> allPermutationsList = new ArrayList<>();

        for(int i=0;i<=processed.size();i++){

            ArrayList<Integer> first = new ArrayList<>();
            for(int j=0;j<i;j++){
                first.add(processed.get(j));
            }

            ArrayList<Integer> last = new ArrayList<>();
            for(int j=i;j<processed.size();j++){
                last.add(processed.get(j));
            }

            ArrayList<Integer> newProcessed = new ArrayList<>();
            newProcessed.addAll(first);
            newProcessed.add(current);
            newProcessed.addAll(last);

            ArrayList<Integer> newUnProcessed = new ArrayList<>();
            for(int j=1;j<unProcessed.size();j++){
                newUnProcessed.add(unProcessed.get(j));
            }

            allPermutationsList.addAll(Permutations(newProcessed, newUnProcessed));
        }
        return allPermutationsList;
    }
}
