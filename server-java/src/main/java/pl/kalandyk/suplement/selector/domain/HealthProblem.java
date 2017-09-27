package pl.kalandyk.suplement.selector.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */

@Entity
public class HealthProblem {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String cause;


    @ManyToMany
    @JoinTable(
            name = "HEALTHPROBLEM_SUPLEMENT",
            joinColumns = @JoinColumn(name = "HEALTH_PROBLEM_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "SUPLEMENT_ID", referencedColumnName = "ID"))

    private List<Suplement> suplements;

    public HealthProblem() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
