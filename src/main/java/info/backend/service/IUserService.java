package info.backend.service;

import info.backend.model.User;

import java.util.List;

public interface IUserService {
    /**
     * Method to find all entities
     * @return the list of entities of UserDao
     */
    public List<User> findAll();

    /**
     * Method to save a user
     * @param user
     * @return user
     */
    public User saveUser(User user);

    /**
     * Method for delete a user by id
     * @param idUser
     */
    public void deleteUserById(Long idUser);
    
}
