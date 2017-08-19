package ua.com.okten.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.okten.entity.Product;

/**
 * Created by torez on 17.08.17.
 */
public interface ProductDao extends JpaRepository<Product, Integer > {
}
