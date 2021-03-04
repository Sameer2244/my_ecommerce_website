package com.springboot.ecommerce.onlineshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(name="id")
    private int id;
    @Column(name="description")
    private String description;
    @Column(name="stars")
    private int stars;

    public Review() {
    }

    public Review(int id, String description, int stars) {
        this.id = id;
        this.description = description;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review [description=" + description + ", id=" + id + ", stars=" + stars + "]";
    }

    
}
