package springBootApp.entities;

/**
 * Created by Letricia on 8/9/16.
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
// this is how hibernate knows this is the helper
//an interface is a special kind of class that can not be instantiated. it can be extended from another class though.
// this dao will automatically find 1 and recieves a long, also finds all. and returns arraylists and hashmaps or just one user
//C.R.U.D. < Create, Read, Update, Delete >
public interface UserDao extends CrudRepository<User, Long> { // interface class can't be instantiated. it can be extended//

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public User findByEmail(String email);

}
