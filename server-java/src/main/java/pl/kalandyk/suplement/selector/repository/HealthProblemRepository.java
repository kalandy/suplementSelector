package pl.kalandyk.suplement.selector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kalandyk.suplement.selector.domain.HealthProblem;
import pl.kalandyk.suplement.selector.domain.Suplement;

@Repository //utworzenie przez springa repozytorium do bazy danych dla HealthProblem (ktory ma id typu Long)
public interface HealthProblemRepository extends CrudRepository<HealthProblem, Long> {


}