import java.util.ArrayList;

//This approach is different than 1.
//In this, we are not using the arraylist as global or passing it in the argument.
//We are creating new arraylist for every function call and adding the elements if they are matched. And,
//At the end, we are just adding the below Function call results to the current function call results.
public class findElement_Indexes_2 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5,9};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> output = findIndexes(a, target, 0);
        for(Integer out: output){
            System.out.print(out + " ");
        }
    }
    public static ArrayList<Integer> findIndexes(int a[], int target, int idx){

        ArrayList<Integer> currList = new ArrayList<>();
        if(idx == a.length){
            return currList;
        }
        if(a[idx] == target){
            currList.add(idx);
        }
        ArrayList<Integer> answerFromBelowFunCall = findIndexes(a, target, idx+1);
        currList.addAll(answerFromBelowFunCall);
        return  currList;
    }
}
