package ru.spring_crud.Project2Boot.web.service;

import ru.spring_crud.Project2Boot.web.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);
}
