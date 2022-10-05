public class EarlyLoading {

    /*
     Using Early loading, the object is created during the class is loaded. So when we have lot of
     singleton classes, unnecessarily the object will be created, and it would cause slowness in the application.
     so, we go with the Lazy loading.

     */

    public static  EarlyLoading earlyLoading = new EarlyLoading();

    private EarlyLoading(){

    }
    public static EarlyLoading getEarlyLoading(){
        return earlyLoading;
    }
}
