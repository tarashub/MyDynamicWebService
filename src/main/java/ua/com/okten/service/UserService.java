package ua.com.okten.service;

import ua.com.okten.dao.UserDao;
import ua.com.okten.entity.User;

import java.util.List;

/**
 * Created by torez on 15.08.17.
 */
public interface UserService {
    void save(String name, String lastName);
    void save(User user);
    User findOne(int id);
    List<User> findAll();
}
