package StringProblems;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayPermutations_2 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        System.out.println(findPermutations(input, 0 ));
    }
    public static ArrayList<ArrayList<Integer>> findPermutations(ArrayList<Integer> a, int pos){
        if(pos == a.size() - 1){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(a);
            ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
            output.add(list);
            return output;
        }
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        for(int i=pos;i<a.size();i++){
                Collections.swap(a, i, pos);
                //System.out.println(a);
                output.addAll(findPermutations(a,pos + 1));
                Collections.swap(a, i, pos);
        }
        return output;
    }

}
