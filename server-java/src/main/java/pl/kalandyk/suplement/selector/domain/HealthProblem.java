package pl.kalandyk.suplement.selector.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by marcinkalandyk on 02.05.2018.
 */

/*!
* \brief Klasa HealthProblem
*
* pokazanie springowi ze HealthProblem jest tabela w bazie danych, automatyczne generowanie ID
*/
@Entity
public class HealthProblem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; /*!< zmienna ID do bazy danych */

    private String name; /*!< Nazwa problemu zdrowotnego */
    private String description; /*!< Opis problemu zdrowotnego */
    private String cause; /*!< Przyczyna problemu zdrowotnego */

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "HEALTHPROBLEM_SUPLEMENT",
            joinColumns = @JoinColumn(name = "HEALTH_PROBLEM_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "SUPLEMENT_ID", referencedColumnName = "ID"))

    private List<Suplement> suplements; /*!< Lista suplementów  */

    public HealthProblem() {
    }

    public Long getId() { return id;} /*!< pobieranie ID */

    public void setId(Long id) {
        this.id = id;
    } /*!< ustawienie ID */

    public String getName() {
        return name;
    } /*!< pobieranie problemu zdrowotnego */

    public void setName(String name) {
        this.name = name;
    } /*!< ustawienie nazwy problemu zdrowotnego */

    public String getDescription() {
        return description;
    } /*!< pobieranie opisu problemu zdrowotnego */

    public void setDescription(String description) { this.description = description; } /*!< ustawienie opisu problemu zdrowotnego */

    public String getCause() {
        return cause;
    } /*!< pobieranie przyczyny problemu zdrowotnego */

    public void setCause(String cause) {
        this.cause = cause;
    } /*!< ustawienie przyczyny problemu zdrowtnego */

    public List<Suplement> getSuplements() {
        return suplements;
    } /*!< pobieranie listy suplementów */

    public void setSuplements(List<Suplement> recommendedSuplements) { this.suplements = recommendedSuplements;} /*!< ustawienie listy suplementów */
}
