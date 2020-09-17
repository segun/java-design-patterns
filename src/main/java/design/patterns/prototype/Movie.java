package design.patterns.prototype;

public class Movie implements PrototypeCapable {           
    private final String name;

    public Movie(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    @Override
    public Movie clone() throws CloneNotSupportedException {        
        System.out.println("Cloning Movie");
        return (Movie) super.clone();
    }
}
