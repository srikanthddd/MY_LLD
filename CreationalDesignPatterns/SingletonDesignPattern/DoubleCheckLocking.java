package CreationalDesignPatterns.SingletonDesignPattern;

public class DoubleCheckLocking {
    public static  DoubleCheckLocking doubleCheckLocking = null;

    private DoubleCheckLocking(){

    }
    public static DoubleCheckLocking getDatabasSingleTon(){

        if(doubleCheckLocking==null) {  // T1, T2 // First check without a lock
            synchronized (DoubleCheckLocking.class) { // T1, T2
                if (doubleCheckLocking == null) { // Second check after a lock
                    return new DoubleCheckLocking(); // T1 T2
                }
            }
        }
        return doubleCheckLocking;
    }
}
