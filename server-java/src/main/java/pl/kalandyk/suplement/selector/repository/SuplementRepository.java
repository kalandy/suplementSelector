package pl.kalandyk.suplement.selector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kalandyk.suplement.selector.domain.Suplement;

//utworzenie przez springa repozytorium do bazy danych dla Suplement (ktory ma id typu Long)
@Repository
public interface SuplementRepository extends CrudRepository<Suplement, Long> {


}