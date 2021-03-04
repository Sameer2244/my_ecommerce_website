package com.springboot.ecommerce.onlineshop.service;

import java.util.List;

import com.springboot.ecommerce.onlineshop.dao.ProductDAO;
import com.springboot.ecommerce.onlineshop.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductDAO dao;

    public List<Product> getProducts(){
        return (List<Product>) dao.findAll();
    }
}
