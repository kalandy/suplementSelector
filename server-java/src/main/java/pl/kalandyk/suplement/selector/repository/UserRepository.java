package pl.kalandyk.suplement.selector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kalandyk.suplement.selector.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
