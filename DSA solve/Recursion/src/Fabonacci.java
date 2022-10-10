public class Fabonacci {

    public static void main(String[] args) {

        int x = 5;
        for(int i=0;i<x;i++){
            System.out.println(printFab(i));
        }
    }

    public static int printFab(int num){
        if(num < 2){
           return num;
        }
        return printFab(num-1) + printFab(num-2);
    }
}
