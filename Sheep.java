public class Sheep implements Animal {
    private String sound = "Baaa";
    private int id;

    @Override
    public Animal clone() {
        Sheep copy = new Sheep();
        copy.setId(this.id);
        return copy;
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + id + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String getDescription() {
        return "A gentle farm animal with woolly fleece.";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
