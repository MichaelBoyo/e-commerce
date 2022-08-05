package com.boyo.ecommerceapi.models;

import com.boyo.ecommerceapi.enums.Colors;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  name;
    private Float price;
    private String description;
    private String image;
    private String category;
    private String company;
    @ElementCollection
    private List<Colors> colors;
    private Boolean featured;
    private Integer inventory;
    private Float averageRating;
    private Integer numberOfReviews;


    private Boolean freeShipping;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id != null && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
