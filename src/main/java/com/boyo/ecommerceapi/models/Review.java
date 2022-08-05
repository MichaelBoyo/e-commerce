package com.boyo.ecommerceapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double rating;
    private String title;
    private String comment;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
}
