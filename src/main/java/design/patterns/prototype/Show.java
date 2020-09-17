package design.patterns.prototype;

public class Show implements PrototypeCapable {
    private final String name;

    public Show(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    @Override
    public Show clone() throws CloneNotSupportedException {        
        System.out.println("Cloning SHow");
        return (Show) super.clone();
    }    
}
