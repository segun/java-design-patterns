package design.patterns.singleton;

public class SimpleSingleton {
    public static SimpleSingleton INSTANCE = new SimpleSingleton();


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
