package ru.javamentor.predProject8.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.javamentor.predProject8.entities.User;
import ru.javamentor.predProject8.exception.DBException;

public interface UserService extends UserDetailsService {
    Iterable<User> getAllUsers() throws DBException;
    User getUserByName(String name) throws DBException;
    User getUserById(Long id) throws DBException;
    Long getUserIdByName(String name) throws DBException;
    void addUser(User user) throws DBException;
    void editUser(User user) throws DBException;
    void deleteUserById(Long id) throws DBException;
    Boolean isExistsUser(String name) throws DBException;
}
