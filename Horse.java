public class Horse implements Animal {
    private String sound = "Neigh";
    private int id;

    @Override
    public Animal clone() {
        Horse copy = new Horse();
        copy.setId(this.id);
        return copy;
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + id + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String getDescription() {
        return "A strong animal often used for riding and farm work.";
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
