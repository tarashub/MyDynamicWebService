package ua.com.okten.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.okten.dao.UserDao;
import ua.com.okten.entity.User;
import ua.com.okten.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;


    @Override
    public void save(String name, String lastName) {
        dao.save(new User(name,lastName));
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public User findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}

