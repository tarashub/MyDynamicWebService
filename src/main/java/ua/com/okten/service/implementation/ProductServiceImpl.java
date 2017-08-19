package ua.com.okten.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.okten.dao.ProductDao;
import ua.com.okten.entity.Product;
import ua.com.okten.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao daoProduct;

    @Override
    public void save(String productName) {
        daoProduct.save(new Product(productName));
    }

    @Override
    public void save(Product product) {
        daoProduct.save(product);
    }

    @Override
    public Product findOne(int id) {
        return daoProduct.findOne(id);
    }

    @Override
    public List<Product> findAll() {
        return daoProduct.findAll();
    }
}
