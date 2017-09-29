package pl.kalandyk.suplement.selector.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by marcinkalandyk on 02.05.2017.
 */

/*!
* \brief Klasa HealthProblem, klasa deklarująca zmienne problemów zdrowotnych
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

    @ManyToMany
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
