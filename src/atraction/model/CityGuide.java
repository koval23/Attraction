package atraction.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CityGuide {
    private List<Attraction> attractions;

    public CityGuide(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public boolean removeAttraction(String nameAttraction) {
        return attractions.removeIf(attraction -> attraction.getType().equals(nameAttraction));
    }

    public Attraction findAttraction(String nameAttraction) {
        return attractions.stream()
                .filter(attraction -> attraction.getName().equals(nameAttraction))
                .findFirst()
                .orElse(null);
    }

    public void getAttractions() {
        attractions.forEach(System.out::println);
    }

    public List<Attraction> filterForType(String typeAttraction) {
        return attractions.stream()
                .filter(attraction -> attraction.getType().equals(typeAttraction))
                .collect(Collectors.toList());
    }

    public List<Attraction> populationAttraction() {
        return attractions.stream()
                .sorted(Comparator.comparingDouble(attraction -> attraction.average()))
                .collect(Collectors.toList());
    }

    public void printAllReviewable() {
        attractions.stream()
                .flatMap(attraction -> attraction.getReviews().stream()
                        .map(review -> attraction.getName() + ": " + review))
                .forEach(System.out::println);
    }

    public void printAllInGroupReviewable(String type) {
        attractions.stream()
                .filter(attraction -> attraction.getType().equals(type))
                .flatMap(attraction -> attraction.getReviews().stream()
                        .map(review -> attraction.getName() + ": " + review))
                .forEach(System.out::println);
    }

    public void printAttractionReviewable(String name) {
        attractions.stream()
                .filter(attraction -> attraction.getName().equals(name))
                .map(Attraction::getReviews)
                .forEach(System.out::println);
    }
}
