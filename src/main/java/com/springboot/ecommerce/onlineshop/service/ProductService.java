package com.springboot.ecommerce.onlineshop.service;

import java.util.List;

import com.springboot.ecommerce.onlineshop.dao.ProductDAO;
import com.springboot.ecommerce.onlineshop.entity.Product;
import com.springboot.ecommerce.onlineshop.entity.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductDAO dao;

    public List<Product> getProducts(){
        return (List<Product>) dao.findAll();
    }

    public Product findbyid(int id){
        return dao.findById(id);
    }

    public List<Review> getReviews(int id){
        return findbyid(id).getReviews();
    }

    public Product addProduct(Product tempProduct){
        tempProduct.setId(0);
        tempProduct.setReviews(null);
        dao.save(tempProduct);
        return tempProduct;
    }

}
