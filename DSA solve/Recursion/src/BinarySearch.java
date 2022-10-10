public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,8,9,20};
        int n = 5;
        int st = 0;
        int end = a.length-1;
        int mid = 0;
        System.out.println(BinarySearch(a, n, st, end, mid));
    }
    public static int BinarySearch(int a[], int n, int st, int end, int mid){
        if(a[mid] == n){
            return mid;
        }
        mid = st + (end-st)/2;
        if(n > a[mid]){
          return  BinarySearch(a, n, mid +1, end, mid);
        }
        return BinarySearch(a, n, st, mid -1, mid);
    }
}
