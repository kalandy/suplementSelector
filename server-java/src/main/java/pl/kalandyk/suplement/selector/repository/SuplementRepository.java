package pl.kalandyk.suplement.selector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kalandyk.suplement.selector.domain.Suplement;

@Repository
public interface SuplementRepository extends CrudRepository<Suplement, Long> {


}