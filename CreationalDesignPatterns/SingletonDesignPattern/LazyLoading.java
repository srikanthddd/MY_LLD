package CreationalDesignPatterns.SingletonDesignPattern;

public class LazyLoading {
    /*

    Using lazy loading, it solves the problem that comes with early loading.
    when we are in multi-threaded environment, Its not going to work.

    */

    public static  LazyLoading lazyLoading = null;

    private LazyLoading(){

    }
    public static LazyLoading getDatabasSingleTon(){
        if(lazyLoading==null){
            return new LazyLoading();
        }
        return lazyLoading;

    }
}
