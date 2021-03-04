package com.springboot.ecommerce.onlineshop.controller;

import java.util.List;

import com.springboot.ecommerce.onlineshop.entity.Product;
import com.springboot.ecommerce.onlineshop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController{

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

}