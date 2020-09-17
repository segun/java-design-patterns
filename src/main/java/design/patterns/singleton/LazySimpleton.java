package design.patterns.singleton;

public class LazySimpleton {
    private static LazySimpleton INSTANCE = null;
    
    /**
     * @return the iNSTANCE
     */
    public static LazySimpleton init() {
        if(INSTANCE == null) {
            System.out.println("First time calling init. We instantiate");
            INSTANCE = new LazySimpleton();
        } else {
            System.out.println("No need to instantiate, return instanced instancce");
        }
        
        return INSTANCE;
    }

    private int val;

    /**
     * @return int return the val
     */
    public int getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(int val) {
        this.val = val;
    }

}
