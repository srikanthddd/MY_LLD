public class IsSortedArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int idx = 0;
        int n = a.length;
        System.out.println(isSorted(a, idx, n));
    }
    public static boolean isSorted(int[] a, int idx, int n){
        if(idx == n-1){
            return true;
        }
        /*
        //We can do it the below way also.

        if(a[idx] > a[idx + 1]){
            return false;
        }
        return isSorted(a, idx+1, n);*/

        return a[idx] < a[idx + 1] && isSorted(a, idx + 1 , n);
    }
}
