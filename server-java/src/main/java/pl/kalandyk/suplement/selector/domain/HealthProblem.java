package pl.kalandyk.suplement.selector.domain;

import java.util.List;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */
public class HealthProblem {

    private String name;
    private String description;
    private String cause;

    private List<Suplement> suplements;

    public HealthProblem() {
    }


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

    public String getCause() {
        return cause;
    }
    public void setCause(String cause) {
        this.cause = cause;
    }

    public List<Suplement> getSuplements() {
        return suplements;
    }

    public void setSuplements(List<Suplement> recommendedSuplements) {
        this.suplements = recommendedSuplements;
    }

}
