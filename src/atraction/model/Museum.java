package atraction.model;

public class Museum extends Attraction {
    private double priceTicket;
    private double kasse;


    public Museum(String name, String description,double priceTicket) {
        super(name, description, "Museum");
        this.priceTicket = priceTicket;
    }

    public boolean payTicket(int count) {
        if (count <= 0) return false;
        kasse += priceTicket * count;
        return true;
    }

    public double getPrice() {
        return priceTicket;
    }

    public double getKasse() {
        return kasse;
    }

    public void getListRewiew() {
        getReviews().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Museum{ " + getName() + "; " + getDescription() + "; " + priceTicket + "; " + kasse + " }";
    }


}
