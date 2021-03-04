package com.springboot.ecommerce.onlineshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(name="id")
    private int id;

    @Column(name="productname")
    private String productname;

    @Column(name="price")
    private int price;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Product() {
    }

    public Product(int id, String productname, int price, List<Review> reviews) {
        this.id = id;
        this.productname = productname;
        this.price = price;
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", price=" + price + ", productname=" + productname + ", reviews=" + reviews + "]";
    }
    
    public void addReview(Review review){
        if(this.reviews.isEmpty())
        this.reviews=new ArrayList<Review>();
        else this.reviews.add(review);
    }
    
}
