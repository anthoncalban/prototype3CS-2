public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Register prototypes
        registry.addPrototype("Sheep", new Sheep());
        registry.addPrototype("Cow", new Cow());
        registry.addPrototype("Horse", new Horse());
        registry.addPrototype("Goat", new Goat());

        // Create animals
        Animal sheep1 = registry.createAnimal("Sheep");
        System.out.println("Created: " + sheep1.getType() + " " + sheep1.getId());
        System.out.println("Description: " + sheep1.getDescription());
        sheep1.makeSound();

        Animal cow1 = registry.createAnimal("Cow");
        System.out.println("\nCreated: " + cow1.getType() + " " + cow1.getId());
        System.out.println("Description: " + cow1.getDescription());
        cow1.makeSound();

        Animal cow2 = registry.createAnimal("Cow");
        System.out.println("\nCreated: " + cow2.getType() + " " + cow2.getId());
        System.out.println("Description: " + cow2.getDescription());
        cow2.makeSound();

        Animal horse1 = registry.createAnimal("Horse");
        System.out.println("\nCreated: " + horse1.getType() + " " + horse1.getId());
        System.out.println("Description: " + horse1.getDescription());
        horse1.makeSound();

        Animal goat1 = registry.createAnimal("Goat");
        System.out.println("\nCreated: " + goat1.getType() + " " + goat1.getId());
        System.out.println("Description: " + goat1.getDescription());
        goat1.makeSound();
    }
}
