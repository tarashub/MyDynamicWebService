package ua.com.okten.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.okten.entity.User;

/**
 * Created by torez on 15.08.17.
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
