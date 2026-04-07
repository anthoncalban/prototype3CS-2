public class Goat implements Animal {
    private String sound = "Maaah";
    private int id;

    @Override
    public Animal clone() {
        Goat copy = new Goat();
        copy.setId(this.id);
        return copy;
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + id + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Goat";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String getDescription() {
        return "A hardy farm animal known for climbing and eating grass.";
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
