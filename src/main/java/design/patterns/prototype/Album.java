package design.patterns.prototype;

public class Album implements PrototypeCapable {
    private final String name;

    public Album(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    @Override
    public Album clone() throws CloneNotSupportedException {        
        System.out.println("Cloning Album");
        return (Album) super.clone();
    }    
}
