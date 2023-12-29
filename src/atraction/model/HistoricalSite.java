package atraction.model;


public class HistoricalSite extends Attraction{

    public HistoricalSite(String name, String description) {
        super(name, description, "HistoricalSite");

    }
    @Override
    public String toString() {
        return "HistoricalSite{"+  getName() + getDescription() + "}";
    }
}
