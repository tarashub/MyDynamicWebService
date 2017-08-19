package ua.com.okten.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "Users_Products",
    joinColumns = @JoinColumn(name = "product_Id"),
    inverseJoinColumns = @JoinColumn(name = "User_id"))
    private List<User> users = new ArrayList<>();

    public Product() {
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String productName, List<User> users) {
        this.productName = productName;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", users=" + users +
                '}';
    }




}
