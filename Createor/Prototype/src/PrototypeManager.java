import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private static Map<String,Animal> prototypes = new HashMap<>();

    public static void addPrototype(String id ,Animal animal) {

        prototypes.put(id,animal);

    }

    public static Animal createPrototype(String id) {

        Animal animal = prototypes.get(id);

        if(animal != null){
            return prototypes.get(id);
        }
        throw new IllegalArgumentException("Prototype with id " + id + " does not exist.");
    }
}
