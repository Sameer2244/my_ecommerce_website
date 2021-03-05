package com.springboot.ecommerce.onlineshop.dao;

import com.springboot.ecommerce.onlineshop.entity.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product,Integer>{
    
    public Product findById(int id);
}
