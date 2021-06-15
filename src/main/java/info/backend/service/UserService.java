package info.backend.service;

import info.backend.model.User;
import info.backend.repository.IUserRepository;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@GraphQLApi
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    /**
     * Method to find all entities
     *
     * @return the list of entities of UserDao
     */
    @Override
    @GraphQLQuery(name = "users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * Method to save a user
     *
     * @param user
     * @return user
     */
    @Override
    @GraphQLMutation(name = "saveUser")
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Method for delete a user by id
     *
     * @param idUser
     * @return
     */
    @Override
    @GraphQLMutation(name = "deleteUserById")
    public void deleteUserById(Long idUser) {
        userRepository.deleteById(idUser);
    }

}
