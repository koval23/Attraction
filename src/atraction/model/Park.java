package atraction.model;

public class Park extends Attraction {


    public Park(String name, String description) {
        super(name, description, "Park");
    }

    @Override
    public String toString() {
        return "Park{" + getName() + getDescription() + "}";
    }
}
