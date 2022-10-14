package StringProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayPermutations_2 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        System.out.println(findPermutations(input, 0, new ArrayList<ArrayList<Integer>>() ));
    }
    public static ArrayList<ArrayList<Integer>> findPermutations(ArrayList<Integer> a, int pos, ArrayList<ArrayList<Integer>> output){
        if(pos == a.size() - 1){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(a);
            output.add(list);
            return output;
        }
        for(int i=pos;i<a.size();i++){
                Collections.swap(a, i, pos);
                //System.out.println(a);
                findPermutations(a,pos + 1, output);
                Collections.swap(a, i, pos);
        }
        return output;
    }

}
