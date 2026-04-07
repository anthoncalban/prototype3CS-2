import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();
    private Map<String, Integer> counters = new HashMap<>();

    public void addPrototype(String type, Animal prototype) {
        prototypes.put(type, prototype);
        counters.put(type, 0);
    }

    public Animal createAnimal(String type) {
        Animal prototype = prototypes.get(type);
        if (prototype != null) {
            int newId = counters.get(type) + 1;
            counters.put(type, newId);

            Animal clone = prototype.clone();
            clone.setId(newId);
            return clone;
        }
        throw new IllegalArgumentException("No prototype registered for type: " + type);
    }
}
