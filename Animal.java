public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    String getType();
    String getSound();
    String getDescription();
    int getId();
    void setId(int id);
}
