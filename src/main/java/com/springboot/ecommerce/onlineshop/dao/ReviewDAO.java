package com.springboot.ecommerce.onlineshop.dao;

import com.springboot.ecommerce.onlineshop.entity.Review;

import org.springframework.data.repository.CrudRepository;

public interface ReviewDAO extends CrudRepository<Review,Integer>{
    
}
