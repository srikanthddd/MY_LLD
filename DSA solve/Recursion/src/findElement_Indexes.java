import java.util.ArrayList;

//Find the indexes whereever the target element is present.
public class findElement_Indexes {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5,9};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> output = findIndexes(a, target, 0, list);
        for(Integer out: output){
            System.out.print(out + " ");
        }
    }

    public static ArrayList<Integer> findIndexes(int a[], int target, int idx, ArrayList<Integer> list){
        if(idx == a.length){
            return list;
        }
        if(a[idx] == target){
            list.add(idx);
            return findIndexes(a, target, idx+1, list);
        }
        return findIndexes(a, target, idx+1, list);
    }
}
