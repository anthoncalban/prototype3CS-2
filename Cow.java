public class Cow implements Animal {
    private String sound = "Moo";
    private int id;

    @Override
    public Animal clone() {
        Cow copy = new Cow();
        copy.setId(this.id);
        return copy;
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + id + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String getDescription() {
        return "A large domesticated animal raised for milk and beef.";
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
