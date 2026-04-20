public class Amenity {

    private String name;

    //  Constructor
    public Amenity(String name) {
        setName(name);
    }

    //  Getter
    public String getName() { return name; }

    // Setter (Validation)
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Invalid amenity name");
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return name;
    }
}
