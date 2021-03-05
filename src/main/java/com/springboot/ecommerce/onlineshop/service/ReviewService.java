package com.springboot.ecommerce.onlineshop.service;

import com.springboot.ecommerce.onlineshop.dao.ProductDAO;
import com.springboot.ecommerce.onlineshop.dao.ReviewDAO;
import com.springboot.ecommerce.onlineshop.entity.Product;
import com.springboot.ecommerce.onlineshop.entity.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewDAO rDao;

    @Autowired
    private ProductDAO pDao;

    //incomplete cannot addreview for product
    public Review addReview(int productid,Review review){
        review.setId(0);
        
        return review;
    }
}
