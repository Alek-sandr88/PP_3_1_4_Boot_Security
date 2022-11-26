package ru.kata.spring.boot_security.demo.servise;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserServise {
    List<User> getAllUsers();

    Object getUserById(long id);

    void addUser(User user);

    void removeUser(long id);

    void updateUser(User user);

    User findByUsername(String username);

    User passwordCoder(User user);
}
