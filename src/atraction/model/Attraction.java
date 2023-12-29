package atraction.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Attraction implements Reviewable {
    private List<String> reviews;
    private List<Integer> grades;
    private String name;
    private String description;
    private String type;

    public Attraction(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
        reviews = new ArrayList<>();
        grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public abstract String toString();

    public void addReview(String review) {
        reviews.add(review);
    }

    public boolean clearList() {
        reviews.clear();
        return true;
    }
    public void addgrade(int grade){
        grades.add(grade);
    }
    public double average(){
        return (double) grades.stream().mapToInt(Integer::intValue).sum() / grades.size();
    }

}

