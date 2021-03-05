package com.springboot.ecommerce.onlineshop.controller;

import java.util.List;

import com.springboot.ecommerce.onlineshop.entity.Product;
import com.springboot.ecommerce.onlineshop.entity.Review;
import com.springboot.ecommerce.onlineshop.service.ProductService;
import com.springboot.ecommerce.onlineshop.service.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController{

    @Autowired
    private ProductService product;

    @Autowired
    private ReviewService review;

    @GetMapping("/")
    public String instructions(){
        String text="welcome";
        return text;
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return product.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getbyid(@PathVariable int id){
        return product.findbyid(id);
    }    

    @GetMapping("/products/{id}/reviews")
    public List<Review> getReviews(@PathVariable int id){
        return product.getReviews(id);
    }
    
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product tempProduct){
        return product.addProduct(tempProduct);
    }

    //this method is not working
    @PostMapping("/products/{productid}/addreview")
    public Review addReview(@PathVariable int productid,@RequestBody Review tempreview){
        return review.addReview(productid, tempreview);
    }
}