package design.patterns.prototype;

import java.util.HashMap;

public class PrototypeFactory {
    public static enum ModelType {
        MOVIE, ALBUM, SHOW
    };

    private static HashMap<ModelType, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.MOVIE, new Movie("Movie"));
        prototypes.put(ModelType.ALBUM, new Album("Album"));
        prototypes.put(ModelType.SHOW, new Show("Show"));
    }

    public static PrototypeCapable getInstance(ModelType modelType) throws CloneNotSupportedException {
        return prototypes.get(modelType).clone();        
    }
}
