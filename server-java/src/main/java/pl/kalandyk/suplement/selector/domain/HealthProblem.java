package pl.kalandyk.suplement.selector.domain;

import java.util.List;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
public class HealthProblem {

    private String name;
    private String description;

    private List<Suplement> recommendedSupplements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Suplement> getRecommendedSupplements() {
        return recommendedSupplements;
    }

    public void setRecommendedSupplements(List<Suplement> recommendedSupplements) {
        this.recommendedSupplements = recommendedSupplements;
    }
}
