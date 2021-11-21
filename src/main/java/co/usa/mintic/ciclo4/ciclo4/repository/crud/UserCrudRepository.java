package co.usa.mintic.ciclo4.ciclo4.repository.crud;

import co.usa.mintic.ciclo4.ciclo4.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Angélica Alzate
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
